class EmpregadoHorista extends Object {
    private String nome;
    private double horasTrabalhadas;
    private double valorHora;
    
    public EmpregadoHorista (String nome, double horasTrabalhadas, double valorHora){
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public double getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(double horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public double getValorHoras() {
        return valorHora;
    }
    public double ganhos () {
        return horasTrabalhadas * valorHora;
    }
    @Override
    public String toString () {
        return String.format ("EmpregadoHorista %s %.2f %.2f", nome, horasTrabalhadas, valorHora);
    }

}
