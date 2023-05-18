public class Main {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5.0);
        System.out.println("Círculo - Área: " + circulo.calcularArea());
        System.out.println("Círculo - Perímetro: " + circulo.calcularPerimetro());

        Retangulo retangulo = new Retangulo(4.0, 6.0);
        System.out.println("Retângulo - Área: " + retangulo.calcularArea());
        System.out.println("Retângulo - Perímetro: " + retangulo.calcularPerimetro());

        Triangulo triangulo = new Triangulo(3.0, 4.0, 5.0, 4.0, 3.0);
        System.out.println("Triângulo - Área: " + triangulo.calcularArea());
        System.out.println("Triângulo - Perímetro: " + triangulo.calcularPerimetro());

        CartaoCredito cartaoCredito = new CartaoCredito("123456789", "12/2025", "João Silva");
        cartaoCredito.realizarPagamento();
        cartaoCredito.emitirRecibo();

        CartaoDebito cartaoDebito = new CartaoDebito("987654321", "Maria Souza");
        cartaoDebito.realizarPagamento();
        cartaoDebito.emitirRecibo();

        Dinheiro dinheiro = new Dinheiro(50.0);
        dinheiro.realizarPagamento();
        dinheiro.emitirRecibo();

        Cachorro cachorro = new Cachorro();
        cachorro.comer();
        cachorro.dormir();
        cachorro.mover();

        Gato gato = new Gato();
        gato.comer();
        gato.dormir();
        gato.mover();

        Peixe peixe = new Peixe();
        peixe.comer();
        peixe.dormir();
        peixe.mover();


        ArquivoTexto arquivoTexto = new ArquivoTexto();
        arquivoTexto.abrir();
        arquivoTexto.fechar();

        ArquivoImagem arquivoImagem = new ArquivoImagem();
        arquivoImagem.abrir();
        arquivoImagem.fechar();

        ArquivoAudio arquivoAudio = new ArquivoAudio();
        arquivoAudio.abrir();
        arquivoAudio.fechar();

        Livro livro = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", 49.99);
        livro.exibirDetalhes();

        Roupa roupa = new Roupa("Nike", "M", 79.99);
        roupa.exibirDetalhes();

        Eletronico eletronico = new Eletronico("Smartphone", "Samsung", 999.99);
        eletronico.exibirDetalhes();


        Gerente gerente = new Gerente("João", 5000.0, 1000.0);
        System.out.println("Salário do gerente: " + gerente.calcularSalario());
        gerente.realizarTarefa();

        Vendedor vendedor = new Vendedor("Maria", 3000.0, 500.0);
        System.out.println("Salário do vendedor: " + vendedor.calcularSalario());
        vendedor.realizarTarefa();

        Estagiario estagiario = new Estagiario("Pedro", 1000.0);
        System.out.println("Salário do estagiário: " + estagiario.calcularSalario());
        estagiario.realizarTarefa();

        Atacante atacante = new Atacante("Roberto", 9);
        atacante.atacar();
        atacante.defender();

        MeioCampo meioCampo = new MeioCampo("Lucas", 8);
        meioCampo.atacar();
        meioCampo.defender();

        Goleiro goleiro = new Goleiro("Daniel", 1);
        goleiro.atacar();
        goleiro.defender();

        ImpressoraJatoTinta jatoTinta = new ImpressoraJatoTinta("Epson");
        jatoTinta.imprimir("Olá, mundo!");
        jatoTinta.escanear();

        ImpressoraLaser laser = new ImpressoraLaser("HP");
        laser.imprimir("Documento importante");
        laser.escanear();

        ImpressoraMatricial matricial = new ImpressoraMatricial("Panasonic");
        matricial.imprimir("Relatório de vendas");
        matricial.escanear();

        Caminhao caminhao = new Caminhao("Caminhão 1");
        caminhao.carregar();
        caminhao.descarregar();

        Trem trem = new Trem("Trem 1");
        trem.carregar();
        trem.descarregar();

        Navio navio = new Navio("Navio 1");
        navio.carregar();
        navio.descarregar();

        DiscoRigido disco = new DiscoRigido("Disco 1");
        disco.lerDados();
        disco.gravarDados();

        PenDrive penDrive = new PenDrive("Pen Drive 1");
        penDrive.lerDados();
        penDrive.gravarDados();

    }
}


abstract class FormaGeometrica {
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Circulo extends FormaGeometrica {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}

class Retangulo extends FormaGeometrica {
    private double comprimento;
    private double largura;

    public Retangulo(double comprimento, double largura) {
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public double calcularArea() {
        return comprimento * largura;
    }

    public double calcularPerimetro() {
        return 2 * (comprimento + largura);
    }
}

class Triangulo extends FormaGeometrica {
    private double base;
    private double altura;
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double base, double altura, double ladoA, double ladoB, double ladoC) {
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double calcularArea() {
        return (base * altura) / 2;
    }

    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
}


abstract class Pagamento {
    public abstract void realizarPagamento();
    public abstract void emitirRecibo();
}

class CartaoCredito extends Pagamento {
    private String numeroCartao;
    private String dataValidade;
    private String nomeTitular;

    public CartaoCredito(String numeroCartao, String dataValidade, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.dataValidade = dataValidade;
        this.nomeTitular = nomeTitular;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de crédito.");
    }

    public void emitirRecibo() {
        System.out.println("Recibo emitido para pagamento com cartão de crédito.");
    }
}

class CartaoDebito extends Pagamento {
    private String numeroCartao;
    private String nomeTitular;

    public CartaoDebito(String numeroCartao, String nomeTitular) {
        this.numeroCartao = numeroCartao;
        this.nomeTitular = nomeTitular;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento realizado com cartão de débito.");
    }

    public void emitirRecibo() {
        System.out.println("Recibo emitido para pagamento com cartão de débito.");
    }
}

class Dinheiro extends Pagamento {
    private double valorPago;

    public Dinheiro(double valorPago) {
        this.valorPago = valorPago;
    }

    public void realizarPagamento() {
        System.out.println("Pagamento realizado em dinheiro.");
    }

    public void emitirRecibo() {
        System.out.println("Recibo emitido para pagamento em dinheiro.");
    }
}



abstract class Animal {
    public abstract void comer();
    public abstract void dormir();
    public abstract void mover();
}

class Cachorro extends Animal {
    public void comer() {
        System.out.println("O cachorro está comendo.");
    }

    public void dormir() {
        System.out.println("O cachorro está dormindo.");
    }

    public void mover() {
        System.out.println("O cachorro está se movendo correndo.");
    }
}

class Gato extends Animal {
    public void comer() {
        System.out.println("O gato está comendo.");
    }

    public void dormir() {
        System.out.println("O gato está dormindo.");
    }

    public void mover() {
        System.out.println("O gato está se movendo pulando.");
    }
}

class Peixe extends Animal {
    public void comer() {
        System.out.println("O peixe está se alimentando.");
    }

    public void dormir() {
        System.out.println("O peixe está descansando no fundo do aquário.");
    }

    public void mover() {
        System.out.println("O peixe está nadando na água.");
    }
}



abstract class Arquivo {
    public abstract void abrir();
    public abstract void fechar();
}

class ArquivoTexto extends Arquivo {
    public void abrir() {
        System.out.println("Abrindo arquivo de texto.");
    }

    public void fechar() {
        System.out.println("Fechando arquivo de texto.");
    }
}

class ArquivoImagem extends Arquivo {
    public void abrir() {
        System.out.println("Abrindo arquivo de imagem.");
    }

    public void fechar() {
        System.out.println("Fechando arquivo de imagem.");
    }
}

class ArquivoAudio extends Arquivo {
    public void abrir() {
        System.out.println("Abrindo arquivo de áudio.");
    }

    public void fechar() {
        System.out.println("Fechando arquivo de áudio.");
    }
}



abstract class Produto {
    public abstract double calcularPreco();
    public abstract void exibirDetalhes();
}

class Livro extends Produto {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Preço: " + preco);
    }
}

class Roupa extends Produto {
    private String marca;
    private String tamanho;
    private double preco;

    public Roupa(String marca, String tamanho, double preco) {
        this.marca = marca;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Roupa: " + marca);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Preço: " + preco);
    }
}

class Eletronico extends Produto {
    private String modelo;
    private String marca;
    private double preco;

    public Eletronico(String modelo, String marca, double preco) {
        this.modelo = modelo;
        this.marca = marca;
        this.preco = preco;
    }

    public double calcularPreco() {
        return preco;
    }

    public void exibirDetalhes() {
        System.out.println("Eletrônico: " + marca + " " + modelo);
        System.out.println("Preço: " + preco);
    }
}


abstract class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();
    public abstract void realizarTarefa();
}

class Gerente extends Funcionario {
    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus) {
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    public double calcularSalario() {
        return salarioBase + bonus;
    }

    public void realizarTarefa() {
        System.out.println("Gerente " + nome + " está supervisionando a equipe.");
    }
}

class Vendedor extends Funcionario {
    private double comissao;

    public Vendedor(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return salarioBase + comissao;
    }

    public void realizarTarefa() {
        System.out.println("Vendedor " + nome + " está realizando vendas.");
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void realizarTarefa() {
        System.out.println("Estagiário " + nome + " está auxiliando nas tarefas diárias.");
    }
}


abstract class Jogador {
    protected String nome;
    protected int numeroCamisa;

    public Jogador(String nome, int numeroCamisa) {
        this.nome = nome;
        this.numeroCamisa = numeroCamisa;
    }

    public abstract void atacar();
    public abstract void defender();
}

class Atacante extends Jogador {
    public Atacante(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    public void atacar() {
        System.out.println("Atacante " + nome + " está atacando o gol adversário.");
    }

    public void defender() {
        System.out.println("Atacante " + nome + " está ajudando na marcação.");
    }
}

class MeioCampo extends Jogador {
    public MeioCampo(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    public void atacar() {
        System.out.println("Meio-campo " + nome + " está criando jogadas ofensivas.");
    }

    public void defender() {
        System.out.println("Meio-campo " + nome + " está ajudando na marcação e no controle do meio de campo.");
    }
}

class Goleiro extends Jogador {
    public Goleiro(String nome, int numeroCamisa) {
        super(nome, numeroCamisa);
    }

    public void atacar() {
        System.out.println("Goleiro " + nome + " está participando do ataque durante um escanteio.");
    }

    public void defender() {
        System.out.println("Goleiro " + nome + " está defendendo o gol adversário.");
    }
}

abstract class Impressora {
    protected String modelo;

    public Impressora(String modelo) {
        this.modelo = modelo;
    }

    public abstract void imprimir(String conteudo);
    public abstract void escanear();
}

class ImpressoraJatoTinta extends Impressora {
    public ImpressoraJatoTinta(String modelo) {
        super(modelo);
    }

    public void imprimir(String conteudo) {
        System.out.println("Imprimindo com a impressora jato de tinta " + modelo + ":");
        System.out.println(conteudo);
    }

    public void escanear() {
        System.out.println("Escaneando com a impressora jato de tinta " + modelo);
    }
}

class ImpressoraLaser extends Impressora {
    public ImpressoraLaser(String modelo) {
        super(modelo);
    }

    public void imprimir(String conteudo) {
        System.out.println("Imprimindo com a impressora laser " + modelo + ":");
        System.out.println(conteudo);
    }

    public void escanear() {
        System.out.println("Escaneando com a impressora laser " + modelo);
    }
}

class ImpressoraMatricial extends Impressora {
    public ImpressoraMatricial(String modelo) {
        super(modelo);
    }

    public void imprimir(String conteudo) {
        System.out.println("Imprimindo com a impressora matricial " + modelo + ":");
        System.out.println(conteudo);
    }

    public void escanear() {
        System.out.println("A impressora matricial " + modelo + " não suporta escaneamento");
    }
}


abstract class Transporte {
    protected String tipo;

    public Transporte(String tipo) {
        this.tipo = tipo;
    }

    public abstract void carregar();
    public abstract void descarregar();
}

class Caminhao extends Transporte {
    public Caminhao(String tipo) {
        super(tipo);
    }

    public void carregar() {
        System.out.println("Carregando o caminhão " + tipo);
    }

    public void descarregar() {
        System.out.println("Descarregando o caminhão " + tipo);
    }
}

class Trem extends Transporte {
    public Trem(String tipo) {
        super(tipo);
    }

    public void carregar() {
        System.out.println("Carregando o trem " + tipo);
    }

    public void descarregar() {
        System.out.println("Descarregando o trem " + tipo);
    }
}

class Navio extends Transporte {
    public Navio(String tipo) {
        super(tipo);
    }

    public void carregar() {
        System.out.println("Carregando o navio " + tipo);
    }

    public void descarregar() {
        System.out.println("Descarregando o navio " + tipo);
    }
}


abstract class DispositivoArmazenamento {
    protected String tipo;

    public DispositivoArmazenamento(String tipo) {
        this.tipo = tipo;
    }

    public abstract void lerDados();
    public abstract void gravarDados();
}

class DiscoRigido extends DispositivoArmazenamento {
    public DiscoRigido(String tipo) {
        super(tipo);
    }

    public void lerDados() {
        System.out.println("Lendo dados do disco rígido " + tipo);
    }

    public void gravarDados() {
        System.out.println("Gravando dados no disco rígido " + tipo);
    }
}

class PenDrive extends DispositivoArmazenamento {
    public PenDrive(String tipo) {
        super(tipo);
    }

    public void lerDados() {
        System.out.println("Lendo dados do pen drive " + tipo);
    }

    public void gravarDados() {
        System.out.println("Gravando dados no pen drive " + tipo);
    }
}
