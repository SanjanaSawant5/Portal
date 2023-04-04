package com.parkingportalmain.web;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import javax.sql.rowset.serial.SerialBlob;

import com.parkingportalmain.dao.FileUploadDao;

@WebServlet("/uploadServlet")
@MultipartConfig(maxFileSize = 16177215)
public class FileUploadServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // get form fields and files
        InputStream registrationv1docInputStream = null;
        InputStream insurancev1docInputStream = null;
        InputStream registrationv2docInputStream = null;
        InputStream insurancev2docInputStream = null;

        Part registrationv1docPart = request.getPart("registrationv1doc");
        Part insurancev1docPart = request.getPart("insurancev1doc");
        Part registrationv2docPart = request.getPart("registrationv2doc");
        Part insurancev2docPart = request.getPart("insurancev2doc");

        if (registrationv1docPart != null) {
            registrationv1docInputStream = registrationv1docPart.getInputStream();
        }
        if (insurancev1docPart != null) {
            insurancev1docInputStream = insurancev1docPart.getInputStream();
        }
        if (registrationv2docPart != null) {
            registrationv2docInputStream = registrationv2docPart.getInputStream();
        }
        if (insurancev2docPart != null) {
            insurancev2docInputStream = insurancev2docPart.getInputStream();
        }

        // create BLOB objects from input streams
        Blob registrationv1doc = null;
        Blob insurancev1doc = null;
        Blob registrationv2doc = null;
        Blob insurancev2doc = null;

        try {
            if (registrationv1docInputStream != null) {
                registrationv1doc = new SerialBlob(registrationv1docInputStream.readAllBytes());
            }
            if (insurancev1docInputStream != null) {
                insurancev1doc = new SerialBlob(insurancev1docInputStream.readAllBytes());
            }
            if (registrationv2docInputStream != null) {
                registrationv2doc = new SerialBlob(registrationv2docInputStream.readAllBytes());
            }
            if (insurancev2docInputStream != null) {
                insurancev2doc = new SerialBlob(insurancev2docInputStream.readAllBytes());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // insert files into database
        FileUploadDao fileUploadDao = new FileUploadDao();
        int row = fileUploadDao.uploadFile(registrationv1doc, insurancev1doc, registrationv2doc, insurancev2doc);

        if (row > 0) {
            response.getWriter().write("File uploaded successfully.");
        } else {
            response.getWriter().write("File upload failed.");
        }
    }

}
