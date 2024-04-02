public final class Bolsista extends Aluno {
    private int bolsa;

    
    public int getBolsa() {
        return bolsa;
    }
    
    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa(){
        System.out.println("Renovando bolsa do aluno "+this.getNome());
    }
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+" è bolsista! Pagamento facilitado");
    }
}
