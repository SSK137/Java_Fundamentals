public class Default_value {
        int num;
        float flt;
        double dbl;
        char chr;
        boolean bool;

        public void defaultvalues(){
            System.out.println("Default value for int = " + num );
            System.out.println("Default value for float = " + flt );
            System.out.println("Default value for float = " + dbl );
            System.out.println("Default value for char = " + chr );
            System.out.println("Default value for boolean = " + bool );
        }
        public static void main(String[] args){
            Default_value defaultvalue = new Default_value();
            defaultvalue.defaultvalues();

        }
}

