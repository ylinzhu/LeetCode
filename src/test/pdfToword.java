package test;

import java.io.*;
import java.security.Timestamp;

/**
 * @Designation:
 * @Author: Ylz
 * @Date: 2019/5/17
 * @Version: 1.0
 */
public class pdfToword {
//    public static void main(String[] args) throws IOException {
//        new FileProcess().parseFile("1","c:/zip/",new File("c:/pdftoword/b.docx"),
//                "a",".docx","c:/pdftoword",1000,"zh-CN");
//    }
public static String substring(String str, int start, int end) {
    if (str == null) {
        return null;
    }

    if (end < 0) {
        end = str.length() + end;
    }

    if (start < 0) {
        start = str.length() + start;
    }

    if (end > str.length()) {
        end = str.length();
    }

    if (start > end) {
        return "";
    }

    if (start < 0) {
        start = 0;
    }

    if (end < 0) {
        end = 0;
    }

    return str.substring(start, end);
}

    public static String getPrefixName(String fileName) {
        if(fileName.indexOf(".") != -1) {
            fileName = fileName.split("\\.")[0];
        }
        return fileName;
    }

    public static void main(String[] args) throws Exception {
        String pdfPah = "c:" + File.separator+"pdftoword"+File.separator+"a.pdf";
        String pptPah = "c:" + File.separator+"pdftoword"+File.separator+"elasticsearch-java.ppt";
        String pdfSegmentPath = "c:" + File.separator+"zip";
        String path =  "c:/zip/t.txt";
        File temp = new File(path);
        if (!temp.exists()){
            temp.createNewFile();
        }
        String sss = "1.pdf";
        System.out.println(sss.lastIndexOf("."));

        System.out.println("ssss"+substring(sss,0,sss.lastIndexOf(".")));

       // checkFile((File) file, extend, YiCATConstants.MAX_FILE_WORDS_MAP.get(7));

       String a = "c:/zip/44/443334/";
       String k = "c:/zip/44/443334/ddd.docx";
        File file = new File(a);
        File f = new File(k);
        if (!f.getParentFile().exists())
            f.getParentFile().mkdirs();

        if (!f.exists()){
            f.createNewFile();
        }
        System.out.println(getPrefixName("/tmxbase/yicat_file_workspace/900001893468/20190623/20190623/64M-test.pdf"));

//        LoggerUtil.info(logger, "[]前缀名：" + prefix);
//        LoggerUtil.info(logger, "[]后缀名：" + extend);
//        LoggerUtil.info(logger, "[]fileType：" + fileType);
//        LoggerUtil.info(logger, "[extend]fileId：" + fileId);
       /*   String zipPath = "c:" +File.separator+"pdftoword"+ File.separator+"a.zip";
        String wordPah =  "c:" + File.separator+"pdftoword"+File.separator+"t.xlsx";
        File file = new File(wordPah);
      PdfUtil pdfUtil = new PdfUtil();

        String s="1-3,4,6,11-17";
        String[] split = s.split(",");
        PdfUtil.pdfToImage(pdfPah);
        //pdfUtil.pdfSplit(pdfPah,pdfSegmentPath,zipPath,split);
        SplitFileUtil.pptSplit(pptPah,pdfSegmentPath,zipPath,split);*/
        // PdfUtil.pdfSegment(pdfPah,pdfSegmentPath,zipPath,20,false);


       // PdfUtil.pdfMerge(zipPath, "c:" + File.separator+"pdftoword");
       // pdfUtil.init();
       // pdfUtil.convertPdfToPPT(pdfPah,wordPah);
        //pdfUtil.convertPdfToExcel(pdfPah,wordPah);


    }
}
