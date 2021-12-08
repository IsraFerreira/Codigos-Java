/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package enciclopediajoo;

/**
 *
 * @author israe
 */
public class EnciclopediaJOO {
    // objeto = característica + comportamento + estado
    
    //classe = molde de objetos  / o que eu tenho, o que eu faço e como está agora
    //classe = atributos / metodos / estado
    
    /* AULA 01
    Classe Caneta
    modelo: Caractere
    cor: Caractere
    ponta: Inteiro
    carga: Inteiro
    tampada: Logico
    
    Metodo rabiscar()
    Se(tampada) entao
       Escreva ("ERRO")
    senao
       Escreva("Rabisco")
    FimSe
    FimMetodo
    Metodo tampar()
       tampada = verdadeiro
    FimMetodo
    FimClasse
    */
    
    /* AULA 02
    Instanciar é gerar um objeto a partir de uma classe (estou instanciando um objeto a partir de uma classe)
    c1 = nova Caneta
    c1.cor = "Azul"
    c1.ponta = "0,5"
    c1.tampada = falso
    c1.rabiscar()
    
    c2 = nova Caneta
    c2.cor = "Vermelho"
    c2.ponta = "1,0"
    c2.tampada = falso
    c2.tampar()
    */
    
    /* AULA 03
    Classe: define atributos e métodos comuns que serão compartilhados por um objeto
    Objeto: É uma instância de uma classe
    */
    
    /* AULA 04
    
    Visibilidade
    
    + publico    - qualquer um pode usar (classe atual e todas as outras classes)
    - privado      - somente eu posso ver/usar  (somente a classe atual)
    # protegido       telefone fixo (apenas para familia)   (a classe atual e a todas as suas sub-classes)
    
    */
    
    /* AULA 05
    Métodos especiais
    
    Métodos acessores
    Getters (pega alguma coisa mantendo a segurança de acesso - get ou is)
    t = e.getTotDoc();
    
    Métodos modificadores
    Setters (coloca alguma coisa mantendo a segurança de acesso - set )
    e.setTotDoc(doc);
    
    Método Construtor
    Construct (executa tarefa sem que o usuário faça chamada)
    
    Metodo construtor()
    tampar()
    cor = "Azul"
    FimMetodo
    
    Metodo construtor(m: caractere, c: caractere, p:real)
    setModelo(m)
    setCor(c)
    setPonta(p)
    tampar()
    FimMetodo
    
    */
    
    /* AULA 06
    Classe - Atributo - Método - Estado
    
    Encapsulamento
    Herança
    Polimorfismo
    
    EHP
    
    Encapsulamento - capsula (envólocro) - serve de proteção / criar padrão 
    Encapsular é ocultar partes independentes da implementação, permitindo construir partes invisíveis ao mundo exterior
    
    Mandamos mensagens pra capsula (objeto) e ela envia uma resposta
    
    Bom objeto encapsulado possui uma boa interface, lista de serviços - comunicação com o meio externo
    
    - Tornar mudanças invisíveis
    - Facilitar a reutilização de códigos
    - Reduzir efeitos colaterais
    
    Interface parece classe mas não tem atributos, apenas métodos
    
    Geralmente na interface todos os métodos são publicos
    
    */
    
    
    /* AULA 07
    Relacionamento entre classes
    
    classe: lutador
    atributos (private - encapsulamento, não podem acessar meus atributos): 
    nome / nacionalidade / idade / altura / peso / categoria (leve, medio, pesado) / vitorias / derrotas / empates
    
    metodos (publico): 
    apresenta(), status(), ganharLuta(), perderLuta(), empatarLuta();    
    */
    
    /* AULA 08
    
    */
    
    /* AULA 09
    Exercícios
    */
    
    /* AULA 10
    Herança
    
    Filho traz características da mãe
    Permite basear uma nova classe na definição de uma outra classe previamente existente
    Herança será aplicada tanto para características quanto para métodos
    
    
    */
    
    /* AULA 11
    
    A - Raiz (inicio)
    ABAB - Folha, não tem filhas

    Ancestral - avô p cima
    Descendente - neto p baixo
    
    Especialização (ir a fundo em descendentes)
    Generalização (ir a fundo em ancestrais)
    
    2 Heranças
    Herança de implementação
    - apenas implementa classe abstrata
    
    Herança para diferença
    - herda da classe, mas acrescenta seu próprio
    
    Posso sobrepor um método
    
    - Conceito Abstrato e final -
    Motodos e classes podem ser abstratos ou finais
    
    Classe abstrata
    não pode ser instanciada (não gera objetos), só pode servir como progenitora.
    
    Metodo abstrato
    Declarado, mas não implementado na progenitora (só pode ser colocano numa interface ou numa classe abstrata).
    
    Classe final
    Não pode ser herdada por outra classe. Obrigatoriamente folha (Não pode ter filhos).
    
    Método final
    Não pode ser sobescrito pelas suas sub-classes. Obrigatoriamente herdado (Tem q ser como é na sua propria classe).
        
    */
    
    /* AULA 12
    Polimorfismo
    
    poli - muitas
    morfo - formas
    Permite que o mesmo nome represente vários comportamentos diferentes
    
    Assinatura do método (quantidade e os tipos dos parâmetros)
    Public float calcMedia(float n1, float n2){}   
    é igual a
    Public Int calcMedia(float v1, float v2){}
    
    2 Tipos de polimorfismo
    1 - Sobreposição (@Override)
    Acontece quando substituímos um método de uma superclasse na sua subclasse, usando a mesma assinatura.
    
    2 - Sobrecarga
    */
    
    /* AULA 13
    2 - Sobrecarga 
    Substituimos um método de uma superclasse na sua subclasse, mais de uma vez, usando assinaturas diferentes
    */
    
    
    /**/
    
}
