/**
 Client side validation for index page
 */



function validateForm() {
    
	var name = document.forms["myForm"]["name"].value;
	var address = document.forms["myForm"]["address"].value;
	var pan = document.forms["myForm"]["pan"].value;
	var dob = document.forms["myForm"]["dob"].value;
	var ayear = document.forms["myForm"]["ayear"].value;
	var income = document.forms["myForm"]["income"].value;
	var taxd = document.forms["myForm"]["taxd"].value;
    
	if(name == null || name == "" || address == null || address == "" || pan == null || pan == "" ||ayear == null || ayear == "" || isNaN(ayear)|| dob == null || dob == "" || income == null || income == ""|| isNaN(income) || taxd == null || taxd == "" || isNaN(taxd)){
		
		
		if (name == null || name == "") {
		       
	        document.getElementById('name').innerHTML="Name must be filled out";
	        
		}
	        if (address == null || address == "") {
	            
	            document.getElementById('address').innerHTML=" Address must be filled out";
	        }
	            if (pan == null || pan == "") {
	                
	                document.getElementById('pan').innerHTML="PAN must be filled out";
	               
	            }
	                if (dob == null || dob == "") {
	                    
	                    document.getElementById('dob').innerHTML=" DOB must be filled out";
	                   
	                }
	                    if (ayear == null || ayear == "" || isNaN(ayear)) {
	                       
	                        document.getElementById('ayear').innerHTML=" Numeric NO. must be filled out ";
	                    }
	                    
	                        if (income == null || income == ""|| isNaN(income)) {
	                            
	                            document.getElementById('income').innerHTML="Numeric Income must be filled out";
	                        }
	                        
	                            if (taxd == null || taxd == "" || isNaN(taxd)) {
	                                
	                                document.getElementById('taxd').innerHTML="Numeric Tax Deducted must be filled out";
	                        		
	                            }
	    return false;
	}

 return true;   
 }
	
	
	
	