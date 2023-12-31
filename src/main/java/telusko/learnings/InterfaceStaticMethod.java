package telusko.learnings;


interface InterfaceStaticMethod{

   public static void main(){
       System.out.println("static method");
   }

    public static void main(String[] args) {
        System.out.println("its psvm inside interface");
        main();
    }

}

