package com.controller;

import java.io.FileOutputStream;  

import javax.xml.bind.JAXBContext;  
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;  
import javax.xml.bind.PropertyException;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import com.pojo.Taxinfo;
import com.pojo.Taxinfolist;


@WebServlet("/InformationController")
public class InformationController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	public static int count =0;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InformationController() {
        super();
        // TODO Auto-generated constructor stub
    }

    private Logger logger = null;
	
	public void init(){
		
		logger = Logger.getRootLogger();
		
		BasicConfigurator.configure();
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		//System.out.println("Hello");
		
		logger.setLevel(Level.INFO);
		logger.debug("Entering into excecution");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try{
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String pan = request.getParameter("pan");
		String dob = request.getParameter("dob");
		int ayear = Integer.parseInt(request.getParameter("ayear")) ;
		double income = Double.parseDouble(request.getParameter("income"));
		double taxd = Double.parseDouble(request.getParameter("taxd"));
		
		if(name.isEmpty()||address.isEmpty()||dob.isEmpty()||pan.isEmpty()||request.getParameter("ayear").isEmpty()||request.getParameter("income").isEmpty()||request.getParameter("taxd").isEmpty())
		{ 
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/index.jsp");
			System.out.println("done");
			out.println("<font color=red>Please fill all the fields</font>");
			rd.include(request, response);
			logger.warn("Mandatory value not filled");
		}
		else
		{
			
			com.pojo.Taxinfo obj = new Taxinfo(name, address,pan, dob, ayear, income, taxd);
			
			com.pojo.Taxinfolist obj1 = new Taxinfolist();
			
			ArrayList<Taxinfo> taxinfoobj = new ArrayList<Taxinfo>();
			
			obj1.setListobj(taxinfoobj);
			
		    taxinfoobj.add(obj);
			

		    com.pojo.Taxinfo obj2 = obj1.getListobj().get(0);
		    //System.out.println(obj2.getName());
			
		    JAXBContext contextObj = null;
			try {
				contextObj = JAXBContext.newInstance(Taxinfo.class);
			} catch (JAXBException e3) {
				// TODO Auto-generated catch block
				e3.printStackTrace();
				logger.error("JAB Exception");
			}  
		    
		    Marshaller marshallerObj = null;
			try {
				marshallerObj = contextObj.createMarshaller();
			} catch (JAXBException e2) {
				// TODO Auto-generated catch block
				e2.printStackTrace();
				logger.error("JAB Exception");
				
			}  
		    try {
				marshallerObj.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			} catch (PropertyException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
				logger.error("JAB Exception");
			}  
		  
		     
		      
		    try {
				marshallerObj.marshal(obj, new FileOutputStream("C:\\Temp\\employee_"+obj2.getName()+count++ +".xml"));
			     System.out.println("Done");
			     System.out.println(obj2.getName()+count);
		    } catch (JAXBException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				logger.error("JAB Exception");
			}  
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/sucess.jsp");
			out.println("<font color=Green>Please find the xml in below path C:\\Temp\\employee_"+obj2.getName()+count +".xml</font>");
			logger.info("XML Sucessfully generated");
			rd.include(request, response);			
		}
		}
		
		catch(NumberFormatException e){
			 
			RequestDispatcher ab = request.getRequestDispatcher("WEB-INF/index.jsp");
			System.out.println("read kiya");
			out.println("<font color=RED> Please enter Year,Income and tax deducted in numbers </font>");
			ab.include(request, response);
			logger.error("Not able to convert into integer");
			
		}
	}

}
