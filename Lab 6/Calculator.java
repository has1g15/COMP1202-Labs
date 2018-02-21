public class Calculator {
	Double x;
    /*
    * Chops up input on ' ' then decides whether to add or multiply.
    * If the string does not contain a valid format returns null.
    */
    public Double x(String x){
    	//First operand in string parameter is stored in the instance variable 	
    	this.x = Double.parseDouble(x.split(" ")[0]);
    		//Depending on the operator, the Adding or Multiplying method is called with the second operand being passed as a parameter  
    		if ((x.split(" ")[1]).equals("+"))
    		{
    			return x(new Double (x.split(" ")[2]));
    		}
    		else if ((x.split(" ")[1]).equals("x"))
    		{
    			return x(Double.parseDouble(x.split(" ")[2]));
    		}
    		else
    		//If the operator is not valid, null is returned 
    		{
    			return null;
    		}
            //return new Double(0);
    }

    /*
    * Adds the parameter x to the instance variable x and returns the answer as a Double.
    */
    public Double x(Double x){
            System.out.println("== Adding ==");
            //Method returns the addition of the instance variable and the parameter 
            return this.x + x;
    }

    /*
    * Multiplies the parameter x by instance variable x and return the value as a Double.
    */
    public Double x(double x){
            System.out.println("== Multiplying ==");
            //Method returns the multiplication of the instance variable and the parameter 
            return this.x * x;
    }

}


