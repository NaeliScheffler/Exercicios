package atividade_8;

public class funcionarios {


    public String nome;
    public String departamento;
    public double salario;
    public String data_entr;
    public String RG;
    public boolean ativo;


    public boolean aumento(double valor) {
        if (ativo == true) {
            this.salario += valor;
            System.out.println("\n Salário reajustado, novo salario: \n" + this.salario);

            return true;
        } else {
            System.out.println("\n Funcionario demitido \n");
            return false;
        }
    }

    public boolean demite() {
        if (ativo == true) {
            System.out.println("\n Funcionario foi demitido \n");
            ativo = false;
            return true;
        } else {
            System.out.println("\n O funcionario nao trabalha mais na empresa \n");
            return false;
        }
    }


    public void anual(double vAnual) {
        System.out.println("\n O salario anual do funcionario" + nome + " eh \n:");
        vAnual = salario * 12;
        System.out.println(vAnual);

    }


    public class Data {
        int dia;
        int mes;
        int ano;

        public Data(int dia, int mes, int ano) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }

        public boolean validaData() {

            if (ano >= 0) {

                if ((mes >= 1) && (mes <= 12)) {

                    if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                        if (dia >= 1 && dia <= 31) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                        if (dia >= 1 && dia <= 30) {
                            return true;
                        } else {
                            return false;
                        }
                    } else {
                        if (ano % 4 != 0) {

                            if (dia >= 1 && dia <= 28) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (ano % 4 == 0) {

                            if (ano % 100 != 0) {

                                if (dia >= 1 && dia <= 29) {
                                    return true;
                                } else {
                                    return false;
                                }
                            } else {

                                if (ano % 400 == 0) {
                                    return true;
                                } else {
                                    return false;
                                }
                            }
                        }
                    }
                } else {
                    return false;
                }
            } else {
                return false;
            }
            return true;
        }


        public void mostrarDataform() {
            if (validaData()) {
                System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
            } else {
                System.out.println("Data não é válida.");
            }
        }
    }

        public void mostrar() {
            System.out.println("\n Nome: \n" + this.nome + "\nRg: " + this.RG + "\n Data de Entrada: \n" + this.data_entr + "\n Departamento: \n" + this.departamento + "\n Salario: \n" + this.salario);


        }



    public String getNome() {
        return nome;
    }

    public String getDepartamento() {
        return departamento;
    }

    public double getSalario() {
        return salario;
    }

    public String getData_entr() {
        return data_entr;
    }

    public String getRG() {
        return RG;
    }

    public boolean getAtivo() {
        return ativo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void setData_entr(String data_entr) {
        this.data_entr = data_entr;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}







