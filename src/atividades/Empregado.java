package atividades;

public class Empregado {

    String  nome;
    String sobrenome;
    double salarioMensal;

    Empregado(String nome, String sobrenome, double salarioMensal){
        this.nome = nome;
        this.sobrenome = sobrenome;

        if(salarioMensal < 0){
            this.salarioMensal = 0.00;
        }else{
            this.salarioMensal = salarioMensal;
        }
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public String getSobrenome(){
        return sobrenome;
    }

    public void setSalarioMensal(double salarioMensal){
        this.salarioMensal = salarioMensal;
    }

    public double getSalarioMensal(){
        return salarioMensal;
    }

    public void salarioAnual(){
        System.out.print("O salário anual de " + nome + " " + sobrenome + " é: " + salarioMensal * 12 + "\n");
    }

    public void novoSalario(){
        System.out.println("Com um aumento de 10% o novo salario mensal de " +
                nome + " " + sobrenome + " é de: " + salarioMensal);
    }

    public void salarioStatus(){
        if(salarioMensal > 10000){
            System.out.print("Você ganha bem!");
        }else{
            System.out.print("Você não ganha bem.");
        }
    }
}
