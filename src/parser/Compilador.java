/* Generated By:JavaCC: Do not edit this line. Compilador.java */
package parser;

import semantico.*;
import apoio.*;
import gerador.*;
import primitivo.*;
import java.io.*;
import java.util.LinkedList;


public class Compilador implements CompiladorConstants {
        static Tabela tabela = new Tabela();

        public static void main(String args[])  throws ParseException, IOException  {
                Compilador compilador = null;
                try {
                        //Config.salvarEmDisco("exemplos/exemplo5.spc");

                        ListaComandosAltoNivel listaComandosAltoNivel = new ListaComandosAltoNivel();
                        compilador = new Compilador(new FileInputStream(Config.NOMEARQ));
                        listaComandosAltoNivel = Compilador.inicio();
//			System.out.println("\nTabela de simbolos: \n" + tabela);
//			System.out.println("\nComandos Primeira Passagem: \n" + listaComandosAltoNivel);

                        ListaComandosPrimitivos listaComandosPrimitivos = new ListaComandosPrimitivos();

                        System.out.println("DISGRASSA\u005cn" +listaComandosAltoNivel.getListaComandosAltoNivel().get(0));

//            listaComandosPrimitivos.addComando(listaComandosAltoNivel.getListaComandosAltoNivel().get(2).geraListaComandosPrimitivos().getListaComandosPrimitivos().get(2));

//			listaComandosPrimitivos.add;
//            for(ComandoAltoNivel cmd : listaComandosAltoNivel.getListaComandosAltoNivel()) {
//				if(cmd != null)
//					listaComandosPrimitivos = listaComandosPrimitivos.concatListaPrimitivo(listaComandosPrimitivos, cmd.geraListaComandosPrimitivos());
//			}
//			
//			System.out.println("\nComandos Segunda Passagem: \n" + listaComandosPrimitivos.toString());


                        String codigoDestino = "";

                }
                catch(FileNotFoundException e) {
                        System.out.println(e.getMessage());
                }
                catch(TokenMgrError e) {
                        System.out.println("Erro lexico\u005cn" + e.getMessage());
                }
                catch(ParseException e) {
                        System.out.println("Erro sint\u00e1tico\u005cn" + e.getMessage());
                }
                catch(ErroSemantico e) {
                        System.out.println(e.getMessage());
                }
        }

/******************************************************************/
  static final public ListaComandosAltoNivel inicio() throws ParseException {
                                    ListaComandosAltoNivel lista;
    lista = programa();
    jj_consume_token(0);
          {if (true) return lista;}
    throw new Error("Missing return statement in function");
  }

  static final public ListaComandosAltoNivel programa() throws ParseException {
                                     ComandoAltoNivel cmd = null; ListaComandosAltoNivel lista = new ListaComandosAltoNivel();
    label_1:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EXIBE:
      case LEITURA:
      case SE:
      case ENQUANTO:
      case NUMERO:
      case PALAVRA:
      case VAR:
        ;
        break;
      default:
        jj_la1[0] = jj_gen;
        break label_1;
      }
      cmd = comando();
                if(cmd != null) {
                        lista.addComando(cmd);
//			cmd.geraListaComandosPrimitivos();
                }
    }
          {if (true) return lista;}
    throw new Error("Missing return statement in function");
  }

  static final public ComandoAltoNivel comando() throws ParseException {
                               ComandoAltoNivel cmd = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
    case PALAVRA:
      declaracao();
      break;
    case VAR:
      cmd = atribuicao();
      break;
    case SE:
      cmd = condicional();
      break;
    case ENQUANTO:
      cmd = enquanto();
      break;
    case LEITURA:
      cmd = entrada();
      break;
    case EXIBE:
      cmd = saida();
      break;
    default:
      jj_la1[1] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
          {if (true) return cmd;}
    throw new Error("Missing return statement in function");
  }

  static final public void declaracao() throws ParseException {
                     Token t; Expressao expressao = null;
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case NUMERO:
      jj_consume_token(NUMERO);
      t = jj_consume_token(VAR);
                Compilador.tabela.adicionarTabela(tabela, t, TipoDado.NUM, tabela.getMarcador());
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ATRIB:
        jj_consume_token(ATRIB);
        expressao();
        break;
      default:
        jj_la1[2] = jj_gen;
        ;
      }
      label_2:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[3] = jj_gen;
          break label_2;
        }
        jj_consume_token(VIRGULA);
        t = jj_consume_token(VAR);
                Compilador.tabela.adicionarTabela(tabela, t, TipoDado.NUM, tabela.getMarcador());
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ATRIB:
          jj_consume_token(ATRIB);
          expressao();
          break;
        default:
          jj_la1[4] = jj_gen;
          ;
        }
      }
      jj_consume_token(PV);
      break;
    case PALAVRA:
      jj_consume_token(PALAVRA);
      t = jj_consume_token(VAR);
                Compilador.tabela.adicionarTabela(tabela, t, TipoDado.STR, tabela.getMarcador());
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ATRIB:
        jj_consume_token(ATRIB);
        expressao();
        break;
      default:
        jj_la1[5] = jj_gen;
        ;
      }
      label_3:
      while (true) {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case VIRGULA:
          ;
          break;
        default:
          jj_la1[6] = jj_gen;
          break label_3;
        }
        jj_consume_token(VIRGULA);
        t = jj_consume_token(VAR);
                Compilador.tabela.adicionarTabela(tabela, t, TipoDado.STR, tabela.getMarcador());
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case ATRIB:
          jj_consume_token(ATRIB);
          expressao();
          break;
        default:
          jj_la1[7] = jj_gen;
          ;
        }
      }
      jj_consume_token(PV);
      break;
    default:
      jj_la1[8] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static final public ComandoAltoNivel atribuicao() throws ParseException {
                                 Token t; ComandoAltoNivel cmd = null; Expressao expressao;
    t = jj_consume_token(VAR);
                AcoesSemanticas.verificarInicializacao(tabela, t.image, t.endLine);
    jj_consume_token(ATRIB);
    expressao = expressao();
    jj_consume_token(PV);
          {if (true) return new ComandoAtribuicao(new Simbolo(t, Compilador.tabela.consultaSimbolo(t.image).getTipo(), tabela.getMarcador()), expressao);}
    throw new Error("Missing return statement in function");
  }

  static final public ComandoAltoNivel condicional() throws ParseException {
                                   ComandoAltoNivel cmd = null; Expressao expressao; ListaComandosAltoNivel lista;
    jj_consume_token(SE);
    jj_consume_token(AP);
    expressao = expressao();
    jj_consume_token(FP);
    lista = programa();
    jj_consume_token(FIMSE);
          {if (true) return new ComandoCondicionalSimples(expressao, lista);}
    throw new Error("Missing return statement in function");
  }

  static final public ComandoAltoNivel enquanto() throws ParseException {
                                ComandoAltoNivel cmd = null; Expressao expressao; ListaComandosAltoNivel lista;
    jj_consume_token(ENQUANTO);
    jj_consume_token(AP);
    expressao = expressao();
    jj_consume_token(FP);
    lista = programa();
    jj_consume_token(FIMENQUANTO);
          {if (true) return new ComandoEnquanto(expressao, lista);}
    throw new Error("Missing return statement in function");
  }

  static final public ComandoAltoNivel entrada() throws ParseException {
                              Token t; ComandoAltoNivel cmd = null;
    jj_consume_token(LEITURA);
    t = jj_consume_token(VAR);
                AcoesSemanticas.verificarInicializacao(tabela, t.image, t.endLine);
    label_4:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[9] = jj_gen;
        break label_4;
      }
      jj_consume_token(VIRGULA);
      t = jj_consume_token(VAR);
                AcoesSemanticas.verificarInicializacao(tabela, t.image, t.endLine);
    }
    jj_consume_token(PV);
          {if (true) return new ComandoEntrada(new Simbolo(t, Compilador.tabela.consultaSimbolo(t.image).getTipo(), tabela.getMarcador()));}
    throw new Error("Missing return statement in function");
  }

  static final public ComandoAltoNivel saida() throws ParseException {
                             ComandoSaida cmd = null; Expressao exp, exp2;
    jj_consume_token(EXIBE);
    exp = expressao();
                cmd = new ComandoSaida(exp);
    label_5:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case VIRGULA:
        ;
        break;
      default:
        jj_la1[10] = jj_gen;
        break label_5;
      }
      jj_consume_token(VIRGULA);
      exp2 = expressao();
                        cmd.getExpressao().concatExpressoes(exp, exp2);
    }
    jj_consume_token(PV);
          {if (true) return new ComandoSaida(exp);}
    throw new Error("Missing return statement in function");
  }

  static final public Expressao expressao() throws ParseException {
                         Expressao expressao = new Expressao();
    expressaoAuxiliar(expressao);

          {if (true) return expressao;}
    throw new Error("Missing return statement in function");
  }

  static final public void expressaoAuxiliar(Expressao expressao) throws ParseException {
                                               Token t; Item item;
    termo(expressao);
    label_6:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OU:
        ;
        break;
      default:
        jj_la1[11] = jj_gen;
        break label_6;
      }
      t = jj_consume_token(OU);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.OU));
      termo(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.OU));
    }
  }

  static final public void termo(Expressao expressao) throws ParseException {
                                   Token t; Item item;
    termo1(expressao);
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case IGUAL:
      t = jj_consume_token(IGUAL);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.IGUAL));
      termo1(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.IGUAL));
      break;
    default:
      jj_la1[12] = jj_gen;
      ;
    }
  }

  static final public void termo1(Expressao expressao) throws ParseException {
                                    Token t; Item item;
    termo2(expressao);
    label_7:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case CONCAT:
        ;
        break;
      default:
        jj_la1[13] = jj_gen;
        break label_7;
      }
      t = jj_consume_token(CONCAT);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.CONCAT));
      termo2(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.CONCAT));
    }
  }

  static final public void termo2(Expressao expressao) throws ParseException {
                                    Token t; Item item;
    termo3(expressao);
    label_8:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SOMA:
      case SUB:
        ;
        break;
      default:
        jj_la1[14] = jj_gen;
        break label_8;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case SOMA:
        t = jj_consume_token(SOMA);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.ADD));
        termo3(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.ADD));
        break;
      case SUB:
        t = jj_consume_token(SUB);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.ADD));
        termo3(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.ADD));
        break;
      default:
        jj_la1[15] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void termo3(Expressao expressao) throws ParseException {
                                    Token t; Item item;
    termo4(expressao);
    label_9:
    while (true) {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
      case DIV:
        ;
        break;
      default:
        jj_la1[16] = jj_gen;
        break label_9;
      }
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MUL:
        t = jj_consume_token(MUL);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.MUL));
        termo4(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.MUL));
        break;
      case DIV:
        t = jj_consume_token(DIV);
                                expressao.addItemInfixo(item = new Operador(t, TipoOperador.DIV));
        termo4(expressao);
                                expressao.addItemPosfixo(item = new Operador(t, TipoOperador.DIV));
        break;
      default:
        jj_la1[17] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    }
  }

  static final public void termo4(Expressao expressao) throws ParseException {
                                    Token t; Token tipo; Token valor; Token sinal; Item item; Expressao exp = new Expressao();
    switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
    case AP:
      jj_consume_token(AP);
      expressaoAuxiliar(expressao);
      jj_consume_token(FP);
      break;
    case NUM:
      valor = jj_consume_token(NUM);
                expressao.addItemPosfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
                expressao.addItemInfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
      break;
    case SOMA:
      sinal = jj_consume_token(SOMA);
      valor = jj_consume_token(NUM);
                expressao.addItemPosfixo(item = new Operador(sinal, TipoOperador.ADD));
                expressao.addItemInfixo(item = new Operador(sinal, TipoOperador.ADD));
                expressao.addItemPosfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
                expressao.addItemInfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
      break;
    case SUB:
      sinal = jj_consume_token(SUB);
      valor = jj_consume_token(NUM);
                expressao.addItemPosfixo(item = new Operador(sinal, TipoOperador.SUB));
                expressao.addItemInfixo(item = new Operador(sinal, TipoOperador.SUB));
                expressao.addItemPosfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
                expressao.addItemInfixo(item = new Operando(valor, TipoDado.NUM, TipoElemento.CTE));
      break;
    case VAR:
      t = jj_consume_token(VAR);
//		System.out.println(tabela.toString());
                AcoesSemanticas.verificarInicializacao(tabela, t.image, t.endLine);
                expressao.addItemPosfixo(item = new Operando(t, Compilador.tabela.consultaSimbolo(t.image).getTipo(), TipoElemento.CTE));
                expressao.addItemInfixo(item = new Operando(t, Compilador.tabela.consultaSimbolo(t.image).getTipo(), TipoElemento.CTE));
      break;
    case STRING:
      valor = jj_consume_token(STRING);
                expressao.addItemPosfixo(item = new Operando(valor, TipoDado.STR, TipoElemento.CTE));
                expressao.addItemInfixo(item = new Operando(valor, TipoDado.STR, TipoElemento.CTE));
      break;
    default:
      jj_la1[18] = jj_gen;
      jj_consume_token(-1);
      throw new ParseException();
    }
  }

  static private boolean jj_initialized_once = false;
  /** Generated Token Manager. */
  static public CompiladorTokenManager token_source;
  static SimpleCharStream jj_input_stream;
  /** Current token. */
  static public Token token;
  /** Next token. */
  static public Token jj_nt;
  static private int jj_ntk;
  static private int jj_gen;
  static final private int[] jj_la1 = new int[19];
  static private int[] jj_la1_0;
  static {
      jj_la1_init_0();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x81ae0,0x81ae0,0x8000000,0x20000,0x8000000,0x8000000,0x20000,0x8000000,0x1800,0x20000,0x20000,0x4000000,0x10000000,0x20000000,0xc00000,0xc00000,0x3000000,0x3000000,0xec4000,};
   }

  /** Constructor with InputStream. */
  public Compilador(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public Compilador(java.io.InputStream stream, String encoding) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser.  ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  static public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor. */
  public Compilador(java.io.Reader stream) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new CompiladorTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  static public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Constructor with generated Token Manager. */
  public Compilador(CompiladorTokenManager tm) {
    if (jj_initialized_once) {
      System.out.println("ERROR: Second call to constructor of static parser. ");
      System.out.println("       You must either use ReInit() or set the JavaCC option STATIC to false");
      System.out.println("       during parser generation.");
      throw new Error();
    }
    jj_initialized_once = true;
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  /** Reinitialise. */
  public void ReInit(CompiladorTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 19; i++) jj_la1[i] = -1;
  }

  static private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }


/** Get the next Token. */
  static final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
    return token;
  }

/** Get the specific Token. */
  static final public Token getToken(int index) {
    Token t = token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  static private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  static private java.util.List<int[]> jj_expentries = new java.util.ArrayList<int[]>();
  static private int[] jj_expentry;
  static private int jj_kind = -1;

  /** Generate ParseException. */
  static public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[30];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 19; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 30; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  /** Enable tracing. */
  static final public void enable_tracing() {
  }

  /** Disable tracing. */
  static final public void disable_tracing() {
  }

}
