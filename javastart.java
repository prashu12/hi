/*Write a Java class Complex for dealing with complex number.
 Your class must have the following features:  */
 class ComplexNumber {

 		double realPart;
 		double imaginaryPart;
 		double add;


 		public ComplexNumber() {
 			realPart=0;
 			imaginaryPart=0;
 		}

 		public ComplexNumber(double realPart,double imaginaryPart) {

 			this.realPart=realPart;
 			this.imaginaryPart=imaginaryPart;
 		}

 		public  ComplexNumber sum(ComplexNumber other) {
 			double r=this.realPart+other.realPart;
 			double i=this.imaginaryPart+other.imaginaryPart;
 			return new ComplexNumber(r,i);

 		}
 		public  ComplexNumber subract(ComplexNumber other) {
 			double r=this.realPart-other.realPart;
 			double i=this.imaginaryPart-other.imaginaryPart;
 			return new ComplexNumber(r,i);

 		}

 		public  ComplexNumber multiply(ComplexNumber other) {
 			double r=this.realPart*other.realPart;
 			double i=this.imaginaryPart*other.imaginaryPart;
 			return new ComplexNumber(r,i);

 		}

 		public  ComplexNumber divide(ComplexNumber other) {
 			double r=this.realPart/other.realPart;
 			double i=this.imaginaryPart/other.imaginaryPart;
 			return new ComplexNumber(r,i);

 		}



 		public void setRealPart(double realPart) {
 			this.realPart=realPart;
 		}

 		public void setImaginaryPart (double imaginaryPart) {
 			this.imaginaryPart=imaginaryPart;
 		}

 		public double getRealPart() {
 			return realPart;
 		}
 		public double getImaginaryPart() {
 			return imaginaryPart;
 		}

 		public String toString() {
 			return realPart+"+i "+imaginaryPart;
 		}
 }