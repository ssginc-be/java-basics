package com.qriosity.day14.jsoup;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;

/**
 * @author Queue-ri
 */
public class ExcelUtil {

    public static void saveCrawlDataToExcel(List<CrawlData> dataList) {
        try {
            String filePath = "c:/data/crawl_result.xlsx";
            Workbook workbook = new XSSFWorkbook();
            Sheet sheet = workbook.createSheet("Crawling Result");

            // 헤더 생성
            Row headerRow = sheet.createRow(0);
            headerRow.createCell(0).setCellValue("Brand");
            headerRow.createCell(1).setCellValue("Title");
            headerRow.createCell(2).setCellValue("Price");
            headerRow.createCell(3).setCellValue("Image Url");

            // 데이터 입력
            int rowNum = 1;
            for(CrawlData data : dataList) {
                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(data.getBrand());
                row.createCell(1).setCellValue(data.getTitle());
                //String formattedPrice = String.format("%,d", data.getPrice()) + "원";
                row.createCell(2).setCellValue(data.getPrice());
                row.createCell(3).setCellValue(data.getImageUrl());
            }

            // 열 너비 자동 조정
            for (int i = 0; i < 4; i++) {
                sheet.autoSizeColumn(i);
            }

            // 파일 저장
            try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
                workbook.write(outputStream);
            }

            System.out.println("Excel file saved successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
