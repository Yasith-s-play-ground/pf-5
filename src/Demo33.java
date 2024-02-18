void main(){
    myMethod(5);
}

//void myMethod(int...x){
//    System.out.println("A. myMethod(int...)"); //int[]
//}

void myMethod(Integer...x){
    System.out.println("B. myMethod(Integer...)"); //Integer[]
}

void myMethod(Number...x){
    System.out.println("C. myMethod(Number...)"); //Number[]
}

//all 3 are applicable