public class Question01 {
        public static void  main(String[] args){
            for(int i=100;i<=200;i++){ // Here we use loop and in specific range

                if ((i%3==0) && (i%4==0)) {  // Here if the number divisible by 3 and 4, both of them then it won't print
                    //anything

                }

                else if(i%3==0){  //Here if the number divisible by 3
                    System.out.println("The "+i+" divisible by 3");
                }

                else if(i%4==0){ //Here if the number divisible by 4
                    System.out.println("The "+i+" divisible by 4");

                }

                else{// Here if the number  neither divisible by 3 nor 4, then it won't print
                    //anything

                }




            }




        }


}
