package com.example;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco() {
        // this.set
        this.setSaldo(0);
    }

    public void estadoatual(){
        System.out.println("-------------------------------------");
        System.out.println("Conta: "+ this.getNumConta());
        System.out.println("Tipo: "+ this.getTipo());
        System.out.println("Dono: "+ this.getDono());
        System.out.println("Saldo: "+this.getSaldo());
        System.out.println("Status: "+this.getStatus());
    }

    public void setTipo(String t) {
        if (t != "CP" && t != "CC") {
            System.out.println("tipo de conta inválida!\nescolha: CP(Conta Poupança) ou CC(Conta Correte)");
        }
        this.tipo = t;
    }
    public String getTipo() {
        return this.tipo;
    }

    // ***** Dono ******
    public void setDono(String cDono) {
        this.dono = cDono;
    }

    public String getDono() {
        return this.dono;
    }

    // ***** Status *****
    public void setStatus(boolean s) {
        this.status = s;
    }

    public boolean getStatus() {
        return this.status;
    }

    // ***** Saldo *******
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double valor) {
        this.saldo = valor;
    }

    // ***** Numero da conta ******
    public int getNumConta() {
        return this.numConta;
    }

    public void setNumconta(int num) {
        this.numConta = num;
    }

    // ****** Sacar e depositar ******
    public void sacar(double valor) {
        if (this.getStatus()) {
            if (this.getSaldo() > 0 && this.getSaldo() <= valor) {
                this.setSaldo(this.getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente!!");
            }
        }
    }

    public void depositar(double valor) {
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.printf("Deposito realizado com sucesso para %s\n", this.getDono());
        }else{
            System.out.println("impossivel realizar deposito!! sua conta está fechada");
        }
    }
    // ****** Abrir e fechar Conta ******

    public void abrirConta(String t) {
        this.setTipo(t);
        this.setStatus(true);

        if (this.getTipo().equals("CC")) {
            this.setSaldo(this.getSaldo() + 50);
        } else {
            this.setSaldo(this.getSaldo() + 150);
        }
    }

    public void fecharConta() {
        if (this.getSaldo() > 0) {
            System.out.printf("Você tem %,.2f na conta, retire antes de fechar a contan\n", this.getSaldo());
        } else if (this.getSaldo() < 0) {
            System.out.printf("Você está devendo %,.2f, pague antes de fechar a conta\n", this.getSaldo());
        } else {
             this.status = false;
        }

    }

    // ****** pagar mensalidade *******
    public void pagarMensalidade() {
        int value = 0;
        if (this.getStatus()) {
            if (this.getTipo() == "CC") {
                value = 12;
            } else {
                value = 20;
            }
            this.setSaldo(this.getSaldo() - value);
        }

    }
}
