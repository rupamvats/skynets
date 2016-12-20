package com.Skynets.utils;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import com.google.common.collect.Table.Cell;

public class SetData {
	public static void toExcel(String fName, String SName,int rIndex,int cIndex,String data)
	{
		try
		{
			File f=new File("E:/data/"+fName+".xlsx");
			FileInputStream fis=new FileInputStream(f);
			Workbook wb=WorkbookFactory.create(fis);
			Sheet st=wb.getSheet("Steet");
			Row r=st.getRow(rIndex);
			Cell c=null;
			try
			{
				c=r.getCell(cIndex);
				c.SetCellvalue(data);
			}
			catch(nullpointerException e)
			{
				c=r.createCell(cIndex);
				c.setcellvalue(data);
			}
			catch(Exception e)
			{
			}
			}
			
	
