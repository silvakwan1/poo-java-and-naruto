public class ninja {
    protected String nome;
    protected String clan;
    protected boolean biju;

    public ninja (String nome ,String clan, boolean biju){
        this.nome = nome;
        this.clan = clan;
        this.biju = biju;
    }

    public void gatNomeandClan(){
        System.out.println("o nome é: "+ nome +" " + clan );
    }

    public void chacra(){
        System.out.println("tem chacra");
    }
}
