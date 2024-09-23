public class uzumaki extends ninja{
   
    public uzumaki (String nome , String clan, boolean biju){
       super(nome, clan, biju);
    }

    public void chacra(){
        System.out.println("clan uzumaki e conhecido por ter bastante chacra");
    }
    
    public void chacra(int quantidade){
        
        if (quantidade >= 5) {
            System.out.println("rasengan gigante");
        }else if (quantidade >= 2) {
            System.out.println("mil clones das sombras");
            
        } else {
            if (biju) {
                System.out.println("tá na hora de usar a biju");
                
            }else{
                System.out.println("não consegue usar nenhum");
                
            }
        }
    }

}
