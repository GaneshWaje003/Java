enum Level{
    Easy , Medium , Hard
}

interface animalBarking {
    void bark();
}

class a implements animalBarking{
    public void bark(){
        System.out.println("barks");
    }
}

class Day4_enumInterfaces{
    public static void main(String[] args) {
        System.out.println("Your Selected Level : " + Level.Easy);
        System.out.println("Your Selected Level : " + Level.Hard);

        a obj = new a ();
        obj.bark();


    }
}