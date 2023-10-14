package atividades;

public class Main {
    public static void main(String[] args) {

        Empregado empOne = new Empregado("Julia", "Fonseca", 8990);
        Empregado empTwo = new Empregado("Marcia", "Senta", 10001);
        Empregado empThree = new Empregado("Cassio", "Pinto", 10000);

        empOne.salarioAnual();
        empTwo.salarioAnual();
        empThree.salarioAnual();

        empOne.setSalarioMensal((empOne.getSalarioMensal()+ empOne.getSalarioMensal() * 0.10));
        empOne.novoSalario();
        empOne.salarioAnual();

        empTwo.setSalarioMensal((empTwo.getSalarioMensal()+ empTwo.getSalarioMensal() * 0.10));
        empTwo.novoSalario();
        empTwo.salarioAnual();

        empThree.setSalarioMensal((empThree.getSalarioMensal()+ empThree.getSalarioMensal() * 0.10));
        empThree.novoSalario();
        empThree.salarioAnual();

        Empregado empFour = new Empregado("Negativado", "Mesmo", -0.02);
        System.out.println(empFour.getSalarioMensal());

    }
}