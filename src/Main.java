import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner tec=new Scanner(System.in);
        int opcao= -1;
        int c=0;
        double soma=0;
        double media=0;
        String []nome= new String[20];
        String [] sobrenome= new String[20];
        Double[] nota= new Double[20];

        while(opcao!=0){
            System.out.println("1- Cadastrar: ");
            System.out.println("2- Informações: ");
            System.out.println("3- Média da turma");
            System.out.println("Digite a opcao desejada: ");

            opcao=tec.nextInt();
            int n=0;

            if(opcao==1){
                for (int i = 0; i < 20; i++) {
                    if (nome[i] == null && sobrenome[i] == null && nota[i] == null) {
                        while (n < 3) {

                            System.out.println("digite o nome do aluno:" +i);
                            nome[i] = tec.next();
                            n = n + 1;
                            System.out.println("digite o sobrenome do aluno:");
                            sobrenome[i] = tec.next();
                            n = n + 1;
                            System.out.println("digite a nota do aluno:");
                            nota[i] = tec.nextDouble();
                            n = n + 1;
                            c++;
                        }
                    }

                }
            }
            if(opcao==2){
                System.out.println("Digite o nome do aluno que deseja pesquisar");
                System.out.print("Digite o nome do aluno:");
                String procurar= tec.next();
                System.out.println("Digite o sobrenome do aluno: ");
                String procurarsobrenome=tec.next();
                for(int i=0; i<c; i++){
                    if(procurar.equals(nome[i]) && procurarsobrenome.equals(sobrenome[i])){
                        System.out.println("Aluno ja cadastrado");
                        System.out.println("Nome: " + nome[i]);
                        System.out.println("Sobrenome: " + sobrenome[i]);
                        System.out.println("Nota: " + nota[i]);
                    } else{
                        System.out.println("Aluno não cadastrado!");
                    }

                }
            }

            if(opcao==3){
                for(int i=0; i<c; i++){
                    soma= nota[i] + soma;
                }
                for(int i=0; i<c; i++){
                    media=soma/c;
                }
                System.out.println(media);
            }
            if(opcao!=1 && opcao!=2 && opcao!=3){
                System.out.println("Opção invalida, digite novamente!");
            }
        }

    }
}