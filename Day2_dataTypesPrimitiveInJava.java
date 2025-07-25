class Day2_dataTypesPrimitiveInJava{
    public static void main(String[] args) {

        // primitive start from small case letters 
        byte by = -128;
        boolean f = 0 < 0;
        short b = -32768;
        char aChar = 9922;
        int c = -999999999;
        double d = 12;
        float aFloat = 12;
        long aLong = 12;
        

        System.out.println("Variables---------");
        System.out.println("byte : "+by);
        System.out.println("boolean : "+f);
        System.out.println("short : "+b);
        System.out.println("char : "+aChar);
        System.out.println("int : "+c);
        System.out.println("double : "+d);
        System.out.println("float : "+aFloat);
        System.out.println("long : "+aLong);
    }
}

/*
  1) byte    - 1byte - 127 to -128
  2) boolean - 1byte - 0 to  1
  3) short   - 2byte - 32767 to -32768
  4) char    - 2bytes - 0 to 65,535 
  4) int     - 4byte - -2,147,483,648 to 2,147,483,647 ---------- max 10 numbers (<3)
  5) 
 */