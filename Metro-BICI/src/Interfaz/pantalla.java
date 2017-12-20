/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import metro.bici.ArchivoTexto;
import metro.bici.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.Timer;


/**
 *
 * @author LuisAlejandro
 */


public class pantalla extends javax.swing.JFrame {

    /**
     * Creates new form pantalla
     */
    
    ArchivoTexto at = new ArchivoTexto ();

    public ArchivoTexto getAt() {
        return at;
    }

    public void setAt(ArchivoTexto at) {
        this.at = at;
    }

    public Buffer getBufRuedas() {
        return BufRuedas;
    }

    public void setBufRuedas(Buffer BufRuedas) {
        this.BufRuedas = BufRuedas;
    }

    public Buffer getBufMarcos() {
        return BufMarcos;
    }

    public void setBufMarcos(Buffer BufMarcos) {
        this.BufMarcos = BufMarcos;
    }

    public Buffer getBufNeumaticos() {
        return BufNeumaticos;
    }

    public void setBufNeumaticos(Buffer BufNeumaticos) {
        this.BufNeumaticos = BufNeumaticos;
    }

    public Buffer getBufBujes() {
        return BufBujes;
    }

    public void setBufBujes(Buffer BufBujes) {
        this.BufBujes = BufBujes;
    }

    public Semaphore getProducRuedas() {
        return ProducRuedas;
    }

    public void setProducRuedas(Semaphore ProducRuedas) {
        this.ProducRuedas = ProducRuedas;
    }

    public Semaphore getConsumRuedas() {
        return ConsumRuedas;
    }

    public void setConsumRuedas(Semaphore ConsumRuedas) {
        this.ConsumRuedas = ConsumRuedas;
    }

    public Semaphore getExclusividadR() {
        return exclusividadR;
    }

    public void setExclusividadR(Semaphore exclusividadR) {
        this.exclusividadR = exclusividadR;
    }

    public Semaphore getProducMarcos() {
        return ProducMarcos;
    }

    public void setProducMarcos(Semaphore ProducMarcos) {
        this.ProducMarcos = ProducMarcos;
    }

    public Semaphore getConsumMarcos() {
        return ConsumMarcos;
    }

    public void setConsumMarcos(Semaphore ConsumMarcos) {
        this.ConsumMarcos = ConsumMarcos;
    }

    public Semaphore getExclusividadM() {
        return exclusividadM;
    }

    public void setExclusividadM(Semaphore exclusividadM) {
        this.exclusividadM = exclusividadM;
    }

    public Semaphore getProducNeumaticos() {
        return ProducNeumaticos;
    }

    public void setProducNeumaticos(Semaphore ProducNeumaticos) {
        this.ProducNeumaticos = ProducNeumaticos;
    }

    public Semaphore getConsumNeumaticos() {
        return ConsumNeumaticos;
    }

    public void setConsumNeumaticos(Semaphore ConsumNeumaticos) {
        this.ConsumNeumaticos = ConsumNeumaticos;
    }

    public Semaphore getExclusividadN() {
        return exclusividadN;
    }

    public void setExclusividadN(Semaphore exclusividadN) {
        this.exclusividadN = exclusividadN;
    }

    public Semaphore getProducBujes() {
        return ProducBujes;
    }

    public void setProducBujes(Semaphore ProducBujes) {
        this.ProducBujes = ProducBujes;
    }

    public Semaphore getConsumBujes() {
        return ConsumBujes;
    }

    public void setConsumBujes(Semaphore ConsumBujes) {
        this.ConsumBujes = ConsumBujes;
    }

    public Semaphore getExclusividadB() {
        return exclusividadB;
    }

    public void setExclusividadB(Semaphore exclusividadB) {
        this.exclusividadB = exclusividadB;
    }

    public ArrayList<ProdRuedas> getListaProdR() {
        return listaProdR;
    }

    public void setListaProdR(ArrayList<ProdRuedas> listaProdR) {
        this.listaProdR = listaProdR;
    }

    public ArrayList<ProdMarcos> getListaProdM() {
        return listaProdM;
    }

    public void setListaProdM(ArrayList<ProdMarcos> listaProdM) {
        this.listaProdM = listaProdM;
    }

    public ArrayList<ProdBujes> getListaProdB() {
        return listaProdB;
    }

    public void setListaProdB(ArrayList<ProdBujes> listaProdB) {
        this.listaProdB = listaProdB;
    }

    public ArrayList<ProdNeumaticos> getListaProdN() {
        return listaProdN;
    }

    public void setListaProdN(ArrayList<ProdNeumaticos> listaProdN) {
        this.listaProdN = listaProdN;
    }

    public ArrayList<EnsambladorT> getListaEnsamT() {
        return listaEnsamT;
    }

    public void setListaEnsamT(ArrayList<EnsambladorT> listaEnsamT) {
        this.listaEnsamT = listaEnsamT;
    }

    public ArrayList<EnsambladorB> getListaEnsamB() {
        return listaEnsamB;
    }

    public void setListaEnsamB(ArrayList<EnsambladorB> listaEnsamB) {
        this.listaEnsamB = listaEnsamB;
    }

    public ProdMarcos getPM() {
        return PM;
    }

    public void setPM(ProdMarcos PM) {
        this.PM = PM;
    }

    public ProdRuedas getPR() {
        return PR;
    }

    public void setPR(ProdRuedas PR) {
        this.PR = PR;
    }

    public ProdBujes getPB() {
        return PB;
    }

    public void setPB(ProdBujes PB) {
        this.PB = PB;
    }

    public ProdNeumaticos getPN() {
        return PN;
    }

    public void setPN(ProdNeumaticos PN) {
        this.PN = PN;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getCapacidadR() {
        return capacidadR;
    }

    public void setCapacidadR(int capacidadR) {
        this.capacidadR = capacidadR;
    }

    public int getCapacidadM() {
        return capacidadM;
    }

    public void setCapacidadM(int capacidadM) {
        this.capacidadM = capacidadM;
    }

    public int getCapacidadN() {
        return capacidadN;
    }

    public void setCapacidadN(int capacidadN) {
        this.capacidadN = capacidadN;
    }

    public int getCapacidadB() {
        return capacidadB;
    }

    public void setCapacidadB(int capacidadB) {
        this.capacidadB = capacidadB;
    }

    public int getpIRuedas() {
        return pIRuedas;
    }

    public void setpIRuedas(int pIRuedas) {
        this.pIRuedas = pIRuedas;
    }

    public int getpIMarcos() {
        return pIMarcos;
    }

    public void setpIMarcos(int pIMarcos) {
        this.pIMarcos = pIMarcos;
    }

    public int getpMRuedas() {
        return pMRuedas;
    }

    public void setpMRuedas(int pMRuedas) {
        this.pMRuedas = pMRuedas;
    }

    public int getpMMArcos() {
        return pMMArcos;
    }

    public void setpMMArcos(int pMMArcos) {
        this.pMMArcos = pMMArcos;
    }

    public int getpIBujes() {
        return pIBujes;
    }

    public void setpIBujes(int pIBujes) {
        this.pIBujes = pIBujes;
    }

    public int getpINeumaticos() {
        return pINeumaticos;
    }

    public void setpINeumaticos(int pINeumaticos) {
        this.pINeumaticos = pINeumaticos;
    }

    public int getpMBujes() {
        return pMBujes;
    }

    public void setpMBujes(int pMBujes) {
        this.pMBujes = pMBujes;
    }

    public int getpMNeumaticos() {
        return pMNeumaticos;
    }

    public void setpMNeumaticos(int pMNeumaticos) {
        this.pMNeumaticos = pMNeumaticos;
    }

    public int geteI() {
        return eI;
    }

    public void seteI(int eI) {
        this.eI = eI;
    }

    public int geteM() {
        return eM;
    }

    public void seteM(int eM) {
        this.eM = eM;
    }

    public Thread getTiempos() {
        return tiempos;
    }

    public void setTiempos(Thread tiempos) {
        this.tiempos = tiempos;
    }

    public Timer getTime() {
        return time;
    }

    public void setTime(Timer time) {
        this.time = time;
    }

    public Timer getTimeB() {
        return timeB;
    }

    public void setTimeB(Timer timeB) {
        this.timeB = timeB;
    }

    public Timer getTimeT() {
        return timeT;
    }

    public void setTimeT(Timer timeT) {
        this.timeT = timeT;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public ActionListener getAcciones() {
        return acciones;
    }

    public void setAcciones(ActionListener acciones) {
        this.acciones = acciones;
    }

    public ActionListener getAccionesT() {
        return accionesT;
    }

    public void setAccionesT(ActionListener accionesT) {
        this.accionesT = accionesT;
    }

    public ActionListener getAccionesB() {
        return accionesB;
    }

    public void setAccionesB(ActionListener accionesB) {
        this.accionesB = accionesB;
    }

    public JTextArea getAreaEnsamblaje() {
        return AreaEnsamblaje;
    }

    public void setAreaEnsamblaje(JTextArea AreaEnsamblaje) {
        this.AreaEnsamblaje = AreaEnsamblaje;
    }

    public JTextArea getAreaProduccion() {
        return AreaProduccion;
    }

    public void setAreaProduccion(JTextArea AreaProduccion) {
        this.AreaProduccion = AreaProduccion;
    }

    public JProgressBar getBarraB() {
        return BarraB;
    }

    public void setBarraB(JProgressBar BarraB) {
        this.BarraB = BarraB;
    }

    public JProgressBar getBarraM() {
        return BarraM;
    }

    public void setBarraM(JProgressBar BarraM) {
        this.BarraM = BarraM;
    }

    public JProgressBar getBarraN() {
        return BarraN;
    }

    public void setBarraN(JProgressBar BarraN) {
        this.BarraN = BarraN;
    }

    public JProgressBar getBarraR() {
        return BarraR;
    }

    public void setBarraR(JProgressBar BarraR) {
        this.BarraR = BarraR;
    }

    public JButton getBotonDetenerE() {
        return BotonDetenerE;
    }

    public void setBotonDetenerE(JButton BotonDetenerE) {
        this.BotonDetenerE = BotonDetenerE;
    }

    public JButton getBotonDetenerP() {
        return BotonDetenerP;
    }

    public void setBotonDetenerP(JButton BotonDetenerP) {
        this.BotonDetenerP = BotonDetenerP;
    }

    public JButton getBotonIniciarE() {
        return BotonIniciarE;
    }

    public void setBotonIniciarE(JButton BotonIniciarE) {
        this.BotonIniciarE = BotonIniciarE;
    }

    public JButton getBotonIniciarP() {
        return BotonIniciarP;
    }

    public void setBotonIniciarP(JButton BotonIniciarP) {
        this.BotonIniciarP = BotonIniciarP;
    }

    public JLabel getNumBici() {
        return NumBici;
    }

    public void setNumBici(JLabel NumBici) {
        this.NumBici = NumBici;
    }

    public JLabel getNumTrici() {
        return NumTrici;
    }

    public void setNumTrici(JLabel NumTrici) {
        this.NumTrici = NumTrici;
    }

    public JLabel getOperadorEnsamB() {
        return OperadorEnsamB;
    }

    public void setOperadorEnsamB(JLabel OperadorEnsamB) {
        this.OperadorEnsamB = OperadorEnsamB;
    }

    public JLabel getOperadorEnsamT() {
        return OperadorEnsamT;
    }

    public void setOperadorEnsamT(JLabel OperadorEnsamT) {
        this.OperadorEnsamT = OperadorEnsamT;
    }

    public JTextField getOperadoresBujes() {
        return OperadoresBujes;
    }

    public void setOperadoresBujes(JTextField OperadoresBujes) {
        this.OperadoresBujes = OperadoresBujes;
    }

    public JTextField getOperadoresMarcos() {
        return OperadoresMarcos;
    }

    public void setOperadoresMarcos(JTextField OperadoresMarcos) {
        this.OperadoresMarcos = OperadoresMarcos;
    }

    public JTextField getOperadoresNeumaticos() {
        return OperadoresNeumaticos;
    }

    public void setOperadoresNeumaticos(JTextField OperadoresNeumaticos) {
        this.OperadoresNeumaticos = OperadoresNeumaticos;
    }

    public JTextField getOperadoresRuedas() {
        return OperadoresRuedas;
    }

    public void setOperadoresRuedas(JTextField OperadoresRuedas) {
        this.OperadoresRuedas = OperadoresRuedas;
    }

    public JButton getRestarBujes() {
        return RestarBujes;
    }

    public void setRestarBujes(JButton RestarBujes) {
        this.RestarBujes = RestarBujes;
    }

    public JButton getRestarEnsamB() {
        return RestarEnsamB;
    }

    public void setRestarEnsamB(JButton RestarEnsamB) {
        this.RestarEnsamB = RestarEnsamB;
    }

    public JButton getRestarEnsamT() {
        return RestarEnsamT;
    }

    public void setRestarEnsamT(JButton RestarEnsamT) {
        this.RestarEnsamT = RestarEnsamT;
    }

    public JButton getRestarMarcos() {
        return RestarMarcos;
    }

    public void setRestarMarcos(JButton RestarMarcos) {
        this.RestarMarcos = RestarMarcos;
    }

    public JButton getRestarNeumaticos() {
        return RestarNeumaticos;
    }

    public void setRestarNeumaticos(JButton RestarNeumaticos) {
        this.RestarNeumaticos = RestarNeumaticos;
    }

    public JButton getRestarRuedas() {
        return RestarRuedas;
    }

    public void setRestarRuedas(JButton RestarRuedas) {
        this.RestarRuedas = RestarRuedas;
    }

    public JButton getSumarBujes() {
        return SumarBujes;
    }

    public void setSumarBujes(JButton SumarBujes) {
        this.SumarBujes = SumarBujes;
    }

    public JButton getSumarEnsamB() {
        return SumarEnsamB;
    }

    public void setSumarEnsamB(JButton SumarEnsamB) {
        this.SumarEnsamB = SumarEnsamB;
    }

    public JButton getSumarEnsamT() {
        return SumarEnsamT;
    }

    public void setSumarEnsamT(JButton SumarEnsamT) {
        this.SumarEnsamT = SumarEnsamT;
    }

    public JButton getSumarMarcos() {
        return SumarMarcos;
    }

    public void setSumarMarcos(JButton SumarMarcos) {
        this.SumarMarcos = SumarMarcos;
    }

    public JButton getSumarNeumaticos() {
        return SumarNeumaticos;
    }

    public void setSumarNeumaticos(JButton SumarNeumaticos) {
        this.SumarNeumaticos = SumarNeumaticos;
    }

    public JButton getSumarRuedas() {
        return SumarRuedas;
    }

    public void setSumarRuedas(JButton SumarRuedas) {
        this.SumarRuedas = SumarRuedas;
    }

    public JLabel getDia() {
        return dia;
    }

    public void setDia(JLabel dia) {
        this.dia = dia;
    }

    public JLabel getDia1() {
        return dia1;
    }

    public void setDia1(JLabel dia1) {
        this.dia1 = dia1;
    }

    public JLabel getjLabel1() {
        return jLabel1;
    }

    public void setjLabel1(JLabel jLabel1) {
        this.jLabel1 = jLabel1;
    }

    public JLabel getjLabel10() {
        return jLabel10;
    }

    public void setjLabel10(JLabel jLabel10) {
        this.jLabel10 = jLabel10;
    }

    public JLabel getjLabel11() {
        return jLabel11;
    }

    public void setjLabel11(JLabel jLabel11) {
        this.jLabel11 = jLabel11;
    }

    public JLabel getjLabel12() {
        return jLabel12;
    }

    public void setjLabel12(JLabel jLabel12) {
        this.jLabel12 = jLabel12;
    }

    public JLabel getjLabel13() {
        return jLabel13;
    }

    public void setjLabel13(JLabel jLabel13) {
        this.jLabel13 = jLabel13;
    }

    public JLabel getjLabel14() {
        return jLabel14;
    }

    public void setjLabel14(JLabel jLabel14) {
        this.jLabel14 = jLabel14;
    }

    public JLabel getjLabel15() {
        return jLabel15;
    }

    public void setjLabel15(JLabel jLabel15) {
        this.jLabel15 = jLabel15;
    }

    public JLabel getjLabel16() {
        return jLabel16;
    }

    public void setjLabel16(JLabel jLabel16) {
        this.jLabel16 = jLabel16;
    }

    public JLabel getjLabel17() {
        return jLabel17;
    }

    public void setjLabel17(JLabel jLabel17) {
        this.jLabel17 = jLabel17;
    }

    public JLabel getjLabel18() {
        return jLabel18;
    }

    public void setjLabel18(JLabel jLabel18) {
        this.jLabel18 = jLabel18;
    }

    public JLabel getjLabel19() {
        return jLabel19;
    }

    public void setjLabel19(JLabel jLabel19) {
        this.jLabel19 = jLabel19;
    }

    public JLabel getjLabel2() {
        return jLabel2;
    }

    public void setjLabel2(JLabel jLabel2) {
        this.jLabel2 = jLabel2;
    }

    public JLabel getjLabel20() {
        return jLabel20;
    }

    public void setjLabel20(JLabel jLabel20) {
        this.jLabel20 = jLabel20;
    }

    public JLabel getjLabel3() {
        return jLabel3;
    }

    public void setjLabel3(JLabel jLabel3) {
        this.jLabel3 = jLabel3;
    }

    public JLabel getjLabel4() {
        return jLabel4;
    }

    public void setjLabel4(JLabel jLabel4) {
        this.jLabel4 = jLabel4;
    }

    public JLabel getjLabel5() {
        return jLabel5;
    }

    public void setjLabel5(JLabel jLabel5) {
        this.jLabel5 = jLabel5;
    }

    public JLabel getjLabel6() {
        return jLabel6;
    }

    public void setjLabel6(JLabel jLabel6) {
        this.jLabel6 = jLabel6;
    }

    public JLabel getjLabel7() {
        return jLabel7;
    }

    public void setjLabel7(JLabel jLabel7) {
        this.jLabel7 = jLabel7;
    }

    public JLabel getjLabel8() {
        return jLabel8;
    }

    public void setjLabel8(JLabel jLabel8) {
        this.jLabel8 = jLabel8;
    }

    public JLabel getjLabel9() {
        return jLabel9;
    }

    public void setjLabel9(JLabel jLabel9) {
        this.jLabel9 = jLabel9;
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JScrollPane getjScrollPane1() {
        return jScrollPane1;
    }

    public void setjScrollPane1(JScrollPane jScrollPane1) {
        this.jScrollPane1 = jScrollPane1;
    }

    public JScrollPane getjScrollPane2() {
        return jScrollPane2;
    }

    public void setjScrollPane2(JScrollPane jScrollPane2) {
        this.jScrollPane2 = jScrollPane2;
    }

    public JLabel getnPB() {
        return nPB;
    }

    public void setnPB(JLabel nPB) {
        this.nPB = nPB;
    }

    public JLabel getnPM() {
        return nPM;
    }

    public void setnPM(JLabel nPM) {
        this.nPM = nPM;
    }

    public JLabel getnPN() {
        return nPN;
    }

    public void setnPN(JLabel nPN) {
        this.nPN = nPN;
    }

    public JLabel getnPR() {
        return nPR;
    }

    public void setnPR(JLabel nPR) {
        this.nPR = nPR;
    }

    public JTextField getTrampilla() {
        return trampilla;
    }

    public void setTrampilla(JTextField trampilla) {
        this.trampilla = trampilla;
    }
    
    Buffer BufRuedas = new Buffer();
    Buffer BufMarcos = new Buffer();
    Buffer BufNeumaticos = new Buffer();
    Buffer BufBujes = new Buffer();
    
    Semaphore ProducRuedas = new Semaphore(Integer.parseInt(at.getVec()[5]));    //Semaforo Productor
    Semaphore ConsumRuedas = new Semaphore(0);    //Semaforo Consumidor
    Semaphore exclusividadR= new Semaphore (1);
    Semaphore ProducMarcos = new Semaphore(Integer.parseInt(at.getVec()[6])); //Semaforo Plantilla Productor
    Semaphore ConsumMarcos = new Semaphore(0); //Semaforo Plantilla Consumidor
    Semaphore exclusividadM= new Semaphore (1);
    Semaphore ProducNeumaticos = new Semaphore(Integer.parseInt(at.getVec()[3]));    //Semaforo Productor
    Semaphore ConsumNeumaticos = new Semaphore(0);    //Semaforo Consumidor
    Semaphore exclusividadN= new Semaphore (1);
    Semaphore ProducBujes = new Semaphore(Integer.parseInt(at.getVec()[4]));    //Semaforo Productor
    Semaphore ConsumBujes = new Semaphore(0);    //Semaforo Consumido
    Semaphore exclusividadB= new Semaphore (1);
    
   public ArrayList<ProdRuedas> listaProdR = new ArrayList<ProdRuedas>();
   public ArrayList<ProdMarcos> listaProdM = new ArrayList<ProdMarcos>();
   public ArrayList<ProdBujes> listaProdB = new ArrayList<ProdBujes>();
   public ArrayList<ProdNeumaticos> listaProdN = new ArrayList<ProdNeumaticos>();
    
   public ArrayList<EnsambladorT> listaEnsamT = new ArrayList<EnsambladorT>();
   public ArrayList<EnsambladorB> listaEnsamB = new ArrayList<EnsambladorB>();
    
    private ProdMarcos PM;
    private ProdRuedas PR;
     private ProdBujes PB;
    private ProdNeumaticos PN;
    
    int tiempo;
    int capacidadR;
    int capacidadM;
    int capacidadN;
    int capacidadB;
    int pIRuedas;
    int pIMarcos;
    int pMRuedas;
    int pMMArcos;
    int pIBujes;
    int pINeumaticos;
    int pMBujes;
    int pMNeumaticos;
    int eI;
    int eM;
    Thread tiempos;
     Timer time;
     Timer timeB;
     Timer timeT;
     int s;
    ActionListener acciones=new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent ae) {
             int dia = Integer.parseInt(jLabel9.getText())+1;
            jLabel9.setText(Integer.toString(dia));
         }
     };
    
    ActionListener accionesT=new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent ae) {
             int dia = Integer.parseInt(dia1.getText())+1;
            dia1.setText(Integer.toString(dia));
         }
     };
    
    ActionListener accionesB=new ActionListener() {

         @Override
         public void actionPerformed(ActionEvent ae) {
             int di = Integer.parseInt(dia.getText())+1;
            dia.setText(Integer.toString(di));
         }
     };
    
    public pantalla() throws IOException {
        at = new ArchivoTexto();
        initComponents();
        
        SumarMarcos.setEnabled(false);
        RestarMarcos.setEnabled(false);
         SumarBujes.setEnabled(false);
        RestarBujes.setEnabled(false);
         SumarNeumaticos.setEnabled(false);
        RestarNeumaticos.setEnabled(false);
        SumarRuedas.setEnabled(false);
        RestarRuedas.setEnabled(false);
        SumarEnsamB.setEnabled(false);
        SumarEnsamT.setEnabled(false);
        RestarEnsamB.setEnabled(false);
        RestarEnsamT.setEnabled(false);
        BotonDetenerP.setEnabled(false);
        BotonDetenerE.setEnabled(false);
        AreaProduccion.setEditable(false);
        AreaEnsamblaje.setEditable(false);
        
        
    }
    
    
    public void ti(){
    
    }
public void agregarProdM (int M){
    
        while (M > 0){
            
            listaProdM.add(new ProdMarcos(exclusividadM,BufMarcos, Integer.toString(listaProdM.size()), ProducMarcos, ConsumMarcos, BarraM, AreaProduccion));
            listaProdM.get(listaProdM.size()-1).start();
            
            AreaProduccion.append("+ Nuevo Productor de Marcos +" +(listaProdM.size()-1)+"\n");
            M--;
            
        }
    
    
    }

public void agregarProdR (int M){
    
        while (M > 0){
            
            listaProdR.add(new ProdRuedas(exclusividadR,BufRuedas, Integer.toString(listaProdR.size()), ProducRuedas, ConsumRuedas, BarraR, AreaProduccion));
            listaProdR.get(listaProdR.size()-1).start();
            
            AreaProduccion.append("+ Nuevo Productor de Ruedas +" +(listaProdR.size()-1)+"\n");
            M--;
            
        }
    
    
    }

                                    

     

     public void agregarEnsamT (int E){
    
        while (E > 0){
            
//String nom,Buffer bufM, Buffer bufR, Semaphore ProductMarcos, Semaphore ConsumMarocos, Semaphore ProductRuedas, Semaphore ConsumRuedas, JProgressBar BarraM, JProgressBar BarraR, JTextArea Ensamblador1, JTextArea Productor
            
            listaEnsamT.add(new EnsambladorT(listaEnsamT,listaEnsamB,timeT,NumTrici,dia1,exclusividadN,exclusividadR,exclusividadB,exclusividadM," ",BufMarcos, BufRuedas,BufNeumaticos,BufBujes, ProducMarcos, ConsumMarcos, ProducRuedas, ConsumRuedas, ProducNeumaticos, ConsumNeumaticos, ProducBujes, ConsumBujes, BarraM, BarraR, BarraN, BarraB, AreaEnsamblaje, AreaProduccion, NumTrici));
            listaEnsamT.get(listaEnsamT.size()-1).start();
            System.out.println("Nuevo ensamblador de triciclo Agregado");
            AreaEnsamblaje.append("Nuevo ensamblador de triciclo Agregado BEIBI \n");
            
            AreaProduccion.append("+ Nuevo Ensamblador de triciclo Agregado +" +(listaEnsamT.size()-1)+"\n");
            E--;
            
            
        
        }
    
    
    }
    
     
                                         

      

  
    
    
                                      

         

     public void agregarEnsamB (int E){
    
        while (E > 0){
            
//String nom,Buffer bufM, Buffer bufR, Semaphore ProductMarcos, Semaphore ConsumMarocos, Semaphore ProductRuedas, Semaphore ConsumRuedas, JProgressBar BarraM, JProgressBar BarraR, JTextArea Ensamblador1, JTextArea Productor
            
            listaEnsamB.add(new EnsambladorB(this,listaEnsamT,listaEnsamB,timeB,NumBici,dia,exclusividadN,exclusividadR,exclusividadB,exclusividadM," ",BufMarcos, BufRuedas,BufNeumaticos,BufBujes, ProducMarcos, ConsumMarcos, ProducRuedas, ConsumRuedas, ProducNeumaticos, ConsumNeumaticos, ProducBujes, ConsumBujes, BarraM, BarraR, BarraN, BarraB, AreaEnsamblaje, AreaProduccion, NumBici));
            listaEnsamB.get(listaEnsamB.size()-1).start();
            System.out.println("Nuevo ensamblador Agregado BEIBI");
            AreaEnsamblaje.append("Nuevo ensamblador Agregado BEIBI \n");
            
            AreaProduccion.append("+ Nuevo Ensamblador de bicicleta Agregado +" +(listaEnsamB.size()-1)+"\n");
            E--;
            
            
        
        }
    
    
    }
    
    

public void agregarProdN (int M){
    
        while (M > 0){
            
            listaProdN.add(new ProdNeumaticos(exclusividadN,BufNeumaticos, Integer.toString(listaProdN.size()), ProducNeumaticos, ConsumNeumaticos, BarraN, AreaProduccion));
            listaProdN.get(listaProdN.size()-1).start();
            
            AreaProduccion.append("+ Nuevo Productor de Neumaticos +" +(listaProdN.size()-1)+"\n");
            M--;
            
        }
    
    
    }

public void agregarProdB (int M){
    
        while (M > 0){
            
            listaProdB.add(new ProdBujes(exclusividadB,BufBujes, Integer.toString(listaProdB.size()), ProducBujes, ConsumBujes, BarraB, AreaProduccion));
            listaProdB.get(listaProdB.size()-1).start();
            
            AreaProduccion.append("+ Nuevo Productor de Neumaticos +" +(listaProdB.size()-1)+"\n");
            M--;
            
        }
    
    
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BotonIniciarP = new javax.swing.JButton();
        BotonDetenerP = new javax.swing.JButton();
        BotonIniciarE = new javax.swing.JButton();
        BotonDetenerE = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        AreaProduccion = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        AreaEnsamblaje = new javax.swing.JTextArea();
        BarraM = new javax.swing.JProgressBar();
        BarraR = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        OperadoresMarcos = new javax.swing.JTextField();
        OperadoresRuedas = new javax.swing.JTextField();
        SumarMarcos = new javax.swing.JButton();
        SumarRuedas = new javax.swing.JButton();
        RestarRuedas = new javax.swing.JButton();
        RestarMarcos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nPR = new javax.swing.JLabel();
        nPM = new javax.swing.JLabel();
        OperadorEnsamB = new javax.swing.JLabel();
        NumBici = new javax.swing.JLabel();
        dia = new javax.swing.JLabel();
        SumarEnsamB = new javax.swing.JButton();
        RestarEnsamB = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        BarraB = new javax.swing.JProgressBar();
        jLabel11 = new javax.swing.JLabel();
        BarraN = new javax.swing.JProgressBar();
        OperadoresBujes = new javax.swing.JTextField();
        OperadoresNeumaticos = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        NumTrici = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        nPB = new javax.swing.JLabel();
        SumarBujes = new javax.swing.JButton();
        RestarBujes = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        nPN = new javax.swing.JLabel();
        SumarNeumaticos = new javax.swing.JButton();
        RestarNeumaticos = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        OperadorEnsamT = new javax.swing.JLabel();
        SumarEnsamT = new javax.swing.JButton();
        RestarEnsamT = new javax.swing.JButton();
        dia1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        trampilla = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BotonIniciarP.setText("Iniciar Produccion");
        BotonIniciarP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarPMouseClicked(evt);
            }
        });
        BotonIniciarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarPActionPerformed(evt);
            }
        });

        BotonDetenerP.setText("Detener Produccion");
        BotonDetenerP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDetenerPMouseClicked(evt);
            }
        });
        BotonDetenerP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetenerPActionPerformed(evt);
            }
        });

        BotonIniciarE.setText("Iniciar Ensamblaje");
        BotonIniciarE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonIniciarEMouseClicked(evt);
            }
        });
        BotonIniciarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonIniciarEActionPerformed(evt);
            }
        });

        BotonDetenerE.setText("Detener Ensamblaje");
        BotonDetenerE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonDetenerEMouseClicked(evt);
            }
        });
        BotonDetenerE.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentHidden(java.awt.event.ComponentEvent evt) {
                BotonDetenerEComponentHidden(evt);
            }
        });
        BotonDetenerE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonDetenerEActionPerformed(evt);
            }
        });
        BotonDetenerE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                BotonDetenerEKeyTyped(evt);
            }
        });

        AreaProduccion.setColumns(20);
        AreaProduccion.setRows(5);
        jScrollPane1.setViewportView(AreaProduccion);

        AreaEnsamblaje.setColumns(20);
        AreaEnsamblaje.setRows(5);
        jScrollPane2.setViewportView(AreaEnsamblaje);

        BarraM.setStringPainted(true);
        BarraM.setMaximum(Integer.parseInt(at.getVec()[6]));

        BarraR.setStringPainted(true);
        BarraR.setMaximum(Integer.parseInt(at.getVec()[5]));

        jLabel1.setText("Ruedas");

        jLabel2.setText("Marcos");

        OperadoresMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresMarcosActionPerformed(evt);
            }
        });
        OperadoresMarcos.setVisible(false);
        OperadoresMarcos.setText(at.getVec()[7].toString());

        OperadoresRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresRuedasActionPerformed(evt);
            }
        });
        OperadoresRuedas.setVisible(false);
        OperadoresRuedas.setText(at.getVec()[8].toString());

        SumarMarcos.setText("Contratar");
        SumarMarcos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarMarcosMouseClicked(evt);
            }
        });
        SumarMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarMarcosActionPerformed(evt);
            }
        });

        SumarRuedas.setText("Contratar");
        SumarRuedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarRuedasMouseClicked(evt);
            }
        });
        SumarRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarRuedasActionPerformed(evt);
            }
        });

        RestarRuedas.setText("Despedir");
        RestarRuedas.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
                RestarRuedasAncestorMoved(evt);
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        RestarRuedas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarRuedasMouseClicked(evt);
            }
        });
        RestarRuedas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarRuedasActionPerformed(evt);
            }
        });

        RestarMarcos.setText("Despedir");
        RestarMarcos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarMarcosMouseClicked(evt);
            }
        });
        RestarMarcos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarMarcosActionPerformed(evt);
            }
        });

        jLabel3.setText("Productores de Ruedas:");

        jLabel4.setText("Productores de Marcos:");

        jLabel5.setText("Ensambladores de bicicletas:");

        jLabel6.setText("Bicicletas Disponibles: ");

        jLabel7.setText("Dias de produccion de bicicletas: ");

        if (Integer.parseInt(at.getVec()[9])<6){
            nPR.setText(at.getVec()[9]);
        }else{
            nPR.setText("5");
        }
        nPR.setToolTipText("");

        if(Integer.parseInt(at.getVec()[10])<8){
            nPM.setText(at.getVec()[10]);
        }else {
            nPM.setText("8");
        }

        if(Integer.parseInt(at.getVec()[15])<3){
            OperadorEnsamB.setText(at.getVec()[15]);
        }else{
            OperadorEnsamB.setText("3");

        }

        NumBici.setText("0");

        dia.setText("0");

        SumarEnsamB.setText("Contratar");
        SumarEnsamB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarEnsamBMouseClicked(evt);
            }
        });
        SumarEnsamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarEnsamBActionPerformed(evt);
            }
        });

        RestarEnsamB.setText("Despedir");
        RestarEnsamB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarEnsamBMouseClicked(evt);
            }
        });
        RestarEnsamB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarEnsamBActionPerformed(evt);
            }
        });

        jLabel10.setText("Bujes");

        BarraB.setStringPainted(true);
        BarraB.setMaximum(Integer.parseInt(at.getVec()[4]));

        jLabel11.setText("Neumatico");

        BarraN.setStringPainted(true);
        BarraN.setMaximum(Integer.parseInt(at.getVec()[3]));

        OperadoresBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresBujesActionPerformed(evt);
            }
        });
        OperadoresBujes.setVisible(false);
        OperadoresBujes.setText(at.getVec()[9].toString());

        OperadoresNeumaticos.setVisible(false);
        OperadoresNeumaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OperadoresNeumaticosActionPerformed(evt);
            }
        });
        OperadoresNeumaticos.setText(at.getVec()[10].toString());

        jLabel12.setText("Triciclos Disponibles: ");

        NumTrici.setText("0");

        jLabel13.setText("Productores de Bujes:");

        if(Integer.parseInt(at.getVec()[8])<5){
            nPB.setText(at.getVec()[8]);
        }else{
            nPB.setText("5");
        }

        SumarBujes.setText("Contratar");
        SumarBujes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarBujesMouseClicked(evt);
            }
        });
        SumarBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarBujesActionPerformed(evt);
            }
        });

        RestarBujes.setText("Despedir");
        RestarBujes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarBujesMouseClicked(evt);
            }
        });
        RestarBujes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarBujesActionPerformed(evt);
            }
        });

        jLabel14.setText("Productores de Neumaticos:");

        if(Integer.parseInt(at.getVec()[7])<5){
            nPN.setText(at.getVec()[7]);
        }else{
            nPN.setText("5");
        }

        SumarNeumaticos.setText("Contratar");
        SumarNeumaticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarNeumaticosMouseClicked(evt);
            }
        });
        SumarNeumaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarNeumaticosActionPerformed(evt);
            }
        });

        RestarNeumaticos.setText("Despedir");
        RestarNeumaticos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarNeumaticosMouseClicked(evt);
            }
        });
        RestarNeumaticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarNeumaticosActionPerformed(evt);
            }
        });

        jLabel15.setText("Ensambladores de triciclos:");

        if (Integer.parseInt(at.getVec()[16])<3){
            OperadorEnsamT.setText(at.getVec()[16]);
        }else{
            OperadorEnsamT.setText("3");
        }

        SumarEnsamT.setText("Contratar");
        SumarEnsamT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SumarEnsamTMouseClicked(evt);
            }
        });
        SumarEnsamT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SumarEnsamTActionPerformed(evt);
            }
        });

        RestarEnsamT.setText("Despedir");
        if(RestarEnsamT.getText()=="1"){
            timeT.stop();
        }
        RestarEnsamT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestarEnsamTMouseClicked(evt);
            }
        });
        RestarEnsamT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RestarEnsamTActionPerformed(evt);
            }
        });

        dia1.setText("0");

        jLabel16.setText("Dias de produccion de triciclos: ");

        jLabel8.setText("Dias:");

        jLabel9.setText("0");

        jLabel17.setText("Bicicletas a producir:");

        jLabel18.setText("Triciclos a producir:");

        jLabel19.setText(at.getVec()[1]);

        jLabel20.setText(at.getVec()[2]);

        trampilla.setVisible(false);
        trampilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                trampillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BarraR, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OperadoresMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BarraM, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OperadoresRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BarraB, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OperadoresBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BarraN, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OperadoresNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumBici))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(NumTrici)))
                                .addGap(75, 75, 75)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel7)
                                    .addComponent(trampilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4)
                                .addComponent(OperadorEnsamB)
                                .addGap(18, 18, 18)
                                .addComponent(SumarEnsamB)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RestarEnsamB, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(OperadorEnsamT)
                                .addGap(18, 18, 18)
                                .addComponent(SumarEnsamT)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(RestarEnsamT, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nPR, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nPB))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nPN))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nPM)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(SumarRuedas, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(SumarBujes, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(SumarMarcos)
                                    .addComponent(SumarNeumaticos))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(RestarRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RestarMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(RestarBujes, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RestarNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dia1)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(dia)
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel9)
                                        .addGap(34, 34, 34)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel18)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel20))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel19)))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonIniciarP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(BotonIniciarE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonDetenerP, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(58, 58, 58)
                                .addComponent(BotonDetenerE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(198, 198, 198))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonIniciarP)
                    .addComponent(BotonIniciarE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonDetenerP)
                    .addComponent(BotonDetenerE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPR)
                            .addComponent(SumarRuedas)
                            .addComponent(RestarRuedas))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPM)
                            .addComponent(SumarMarcos)
                            .addComponent(RestarMarcos))
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPB)
                            .addComponent(SumarBujes)
                            .addComponent(RestarBujes))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nPN)
                            .addComponent(SumarNeumaticos)
                            .addComponent(RestarNeumaticos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SumarEnsamB)
                            .addComponent(RestarEnsamB)
                            .addComponent(OperadorEnsamB)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SumarEnsamT)
                            .addComponent(RestarEnsamT)
                            .addComponent(OperadorEnsamT)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OperadoresMarcos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addComponent(jLabel1)
                                .addGap(3, 3, 3)
                                .addComponent(BarraR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(OperadoresRuedas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraM, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OperadoresBujes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BarraB, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BarraN, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OperadoresNeumaticos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(dia)
                        .addComponent(jLabel8)
                        .addComponent(jLabel9)
                        .addComponent(jLabel17)
                        .addComponent(jLabel19))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(NumBici)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dia1)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NumTrici)
                    .addComponent(jLabel18)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(trampilla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OperadoresBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresBujesActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(OperadoresBujes.getText())==1)
            RestarBujes.setEnabled(false);
    }//GEN-LAST:event_OperadoresBujesActionPerformed

    private void RestarEnsamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarEnsamBActionPerformed
        // TODO add your handling code here:
          if(Integer.parseInt(OperadorEnsamB.getText())>0)
        {
            int res = Integer.parseInt(OperadorEnsamB.getText());
            res--;
            OperadorEnsamB.setText(Integer.toString(res));
        AreaProduccion.append("-Se paro un ensamblador de Bicicletas "+(listaEnsamB.size()-1)+"-\n");
        listaEnsamB.get(listaEnsamB.size()-1).setRun(false);
        listaEnsamB.remove(listaEnsamB.size()-1);
        if(res==0){
        timeB.stop();
        }
        }
    }//GEN-LAST:event_RestarEnsamBActionPerformed

    private void RestarEnsamBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarEnsamBMouseClicked
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_RestarEnsamBMouseClicked

    private void SumarEnsamBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarEnsamBActionPerformed
        // TODO add your handling code here:
        int sum = Integer.parseInt(OperadorEnsamB.getText());
        if(sum<Integer.parseInt(at.getVec()[16] )&& sum<3){
        sum++;
        OperadorEnsamB.setText(Integer.toString(sum));
        agregarEnsamB(1);}
    }//GEN-LAST:event_SumarEnsamBActionPerformed

    private void SumarEnsamBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarEnsamBMouseClicked
        // TODO add your handling code here:

       
    }//GEN-LAST:event_SumarEnsamBMouseClicked

    private void RestarMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarMarcosActionPerformed
       if(Integer.parseInt(nPM.getText())>0)
        {
            int res = Integer.parseInt(nPM.getText());
            res--;
            nPM.setText(Integer.toString(res));
            
            AreaProduccion.append("-Se paro el productor de Marcos "+(listaProdM.size()-1)+"-\n");
            listaProdM.get(listaProdM.size()-1).setRun(false);
            listaProdM.remove(listaProdM.size()-1);
        }
    }//GEN-LAST:event_RestarMarcosActionPerformed

    private void RestarMarcosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarMarcosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RestarMarcosMouseClicked

    private void RestarRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarRuedasActionPerformed
        // TODO add your handling code here:

         
         
         if(Integer.parseInt(nPR.getText())>0)
        {
            int res = Integer.parseInt(nPR.getText());
            res--;
            nPR.setText(Integer.toString(res));
            
            AreaProduccion.append("-Se paro el productor de Ruedas "+(listaProdR.size()-1)+"-\n");
            listaProdR.get(listaProdR.size()-1).setRun(false);
            listaProdR.remove(listaProdR.size()-1);
        }
         
         
    }//GEN-LAST:event_RestarRuedasActionPerformed

    private void RestarRuedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarRuedasMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RestarRuedasMouseClicked

    private void RestarRuedasAncestorMoved(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_RestarRuedasAncestorMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_RestarRuedasAncestorMoved

    private void SumarRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarRuedasActionPerformed
        
        if(Integer.parseInt(nPR.getText())<6 && Integer.parseInt(nPR.getText())<Integer.parseInt(at.getVec()[13])){
        
         
        int sum = Integer.parseInt(nPR.getText());
        sum++;
        nPR.setText(Integer.toString(sum));
        agregarProdR(1);}
        
        
        
    }//GEN-LAST:event_SumarRuedasActionPerformed

    private void SumarRuedasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarRuedasMouseClicked
        
    }//GEN-LAST:event_SumarRuedasMouseClicked

    private void SumarMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarMarcosActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(nPM.getText())<8 && Integer.parseInt(nPM.getText())<Integer.parseInt(at.getVec()[14])){
        
         
        int sum = Integer.parseInt(nPM.getText());
        sum++;
        nPM.setText(Integer.toString(sum));
        agregarProdM(1);}
        
    }//GEN-LAST:event_SumarMarcosActionPerformed

    private void SumarMarcosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarMarcosMouseClicked
       
    }//GEN-LAST:event_SumarMarcosMouseClicked

    private void OperadoresRuedasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresRuedasActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(OperadoresRuedas.getText())==1)
            RestarRuedas.setEnabled(false);
    }//GEN-LAST:event_OperadoresRuedasActionPerformed

    private void OperadoresMarcosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresMarcosActionPerformed
     if(Integer.parseInt(OperadoresMarcos.getText())==1)
            RestarMarcos.setEnabled(false);
    }//GEN-LAST:event_OperadoresMarcosActionPerformed

    private void BotonDetenerEComponentHidden(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_BotonDetenerEComponentHidden
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetenerEComponentHidden

    private void BotonDetenerEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDetenerEMouseClicked
      
    }//GEN-LAST:event_BotonDetenerEMouseClicked

    private void BotonIniciarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarEActionPerformed
        // TODO add your handling code here:
        timeT.start();
        timeB.start();
        BotonDetenerE.setEnabled(true);
        SumarEnsamT.setEnabled(true);
        RestarEnsamT.setEnabled(true);
        SumarEnsamB.setEnabled(true);
        RestarEnsamB.setEnabled(true);
        
        int x = 0;
        int y = 0;
        
        while (x < Integer.parseInt(OperadorEnsamT.getText())){
            
        listaEnsamT.add(new EnsambladorT(listaEnsamT,listaEnsamB,timeT,NumTrici,dia1,exclusividadN,exclusividadR,exclusividadB,exclusividadM,"Ensamblador Triciclo", BufMarcos, BufRuedas, BufNeumaticos, BufBujes, ProducMarcos, ConsumMarcos, ProducRuedas, ConsumRuedas, ProducNeumaticos, ConsumNeumaticos,ProducBujes, ConsumBujes, BarraM, BarraR, BarraN, BarraB, AreaEnsamblaje, AreaProduccion, NumTrici));
            listaEnsamT.get(x).start();
            AreaEnsamblaje.append("****** Empezo el Ensamblador de Triciclos******\n");
            listaEnsamT.get(x).setRun(true);
        x++;
        }
              
        x = 0;
        
        while (x < Integer.parseInt(OperadorEnsamB.getText())){
            
        listaEnsamB.add(new EnsambladorB(this,listaEnsamT,listaEnsamB,timeB,NumBici,dia,exclusividadN,exclusividadR,exclusividadB,exclusividadM, "Ensamblador Bicicleta", BufMarcos, BufRuedas, BufNeumaticos, BufBujes, ProducMarcos, ConsumMarcos, ProducRuedas, ConsumRuedas, ProducNeumaticos, ConsumNeumaticos,ProducBujes, ConsumBujes, BarraM, BarraR, BarraN, BarraB, AreaEnsamblaje, AreaProduccion, NumBici));
            listaEnsamB.get(x).start();
            AreaEnsamblaje.append("****** Empezo el Ensamblador de Bicicletas******\n");
            listaEnsamB.get(x).setRun(true);
        x++;
        } 
        
        
        
    }//GEN-LAST:event_BotonIniciarEActionPerformed

    private void BotonIniciarEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarEMouseClicked
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_BotonIniciarEMouseClicked

    private void BotonDetenerPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetenerPActionPerformed
        // TODO add your handling code here:
        pararProd();
    }//GEN-LAST:event_BotonDetenerPActionPerformed

    private void BotonDetenerPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonDetenerPMouseClicked
        // TODO add your handling code here:
        
      

        // pararProd();
    }//GEN-LAST:event_BotonDetenerPMouseClicked

    private void BotonIniciarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonIniciarPActionPerformed
         IniciarProd();
        agregarProdM(Integer.parseInt(nPM.getText()));
        agregarProdR(Integer.parseInt(nPR.getText()));
        agregarProdN(Integer.parseInt(nPN.getText()));
        agregarProdB(Integer.parseInt(nPB.getText()));
        
        SumarMarcos.setEnabled(true);
        RestarMarcos.setEnabled(true);
        SumarRuedas.setEnabled(true);
        RestarRuedas.setEnabled(true);
        SumarNeumaticos.setEnabled(true);
        RestarNeumaticos.setEnabled(true);
        SumarBujes.setEnabled(true);
        RestarBujes.setEnabled(true);
        
        BotonDetenerP.setEnabled(true);
        Timer T=new Timer(Integer.parseInt(at.getVec()[0])*1000, acciones);
        T.start();
        timeB=new Timer(Integer.parseInt(at.getVec()[0])*1000, accionesB);
        timeT=new Timer(Integer.parseInt(at.getVec()[0])*1000, accionesT);
    }//GEN-LAST:event_BotonIniciarPActionPerformed

    private void BotonIniciarPMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonIniciarPMouseClicked
       
    }//GEN-LAST:event_BotonIniciarPMouseClicked

    private void SumarBujesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarBujesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SumarBujesMouseClicked

    private void SumarBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarBujesActionPerformed
        // TODO add your handling code here:
         if(Integer.parseInt(nPB.getText())<5 && Integer.parseInt(nPB.getText())<Integer.parseInt(at.getVec()[12])){
        
         
        int sum = Integer.parseInt(nPB.getText());
        sum++;
        nPB.setText(Integer.toString(sum));
        agregarProdB(1);}
    }//GEN-LAST:event_SumarBujesActionPerformed

    private void RestarBujesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarBujesMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RestarBujesMouseClicked

    private void RestarBujesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarBujesActionPerformed
        // TODO add your handling code here:
        
        if(Integer.parseInt(nPB.getText())>0)
        {
            int res = Integer.parseInt(nPB.getText());
            res--;
            nPB.setText(Integer.toString(res));
            
            AreaProduccion.append("-Se paro el productor de Bujes "+(listaProdB.size()-1)+"-\n");
            listaProdB.get(listaProdB.size()-1).setRun(false);
            listaProdB.remove(listaProdB.size()-1);
        }
    }//GEN-LAST:event_RestarBujesActionPerformed

    private void SumarNeumaticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarNeumaticosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SumarNeumaticosMouseClicked

    private void SumarNeumaticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarNeumaticosActionPerformed
        // TODO add your handling code here:
         if(Integer.parseInt(nPN.getText())<5 && Integer.parseInt(nPN.getText())<Integer.parseInt(at.getVec()[11])){
        
         
        int sum = Integer.parseInt(nPN.getText());
        sum++;
        nPN.setText(Integer.toString(sum));
        agregarProdN(1);}
    }//GEN-LAST:event_SumarNeumaticosActionPerformed

    private void RestarNeumaticosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarNeumaticosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_RestarNeumaticosMouseClicked

    private void RestarNeumaticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarNeumaticosActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(nPN.getText())>0)
        {
            int res = Integer.parseInt(nPN.getText());
            res--;
            nPN.setText(Integer.toString(res));
            
            AreaProduccion.append("-Se paro el productor de Neumaticos "+(listaProdN.size()-1)+"-\n");
            listaProdN.get(listaProdN.size()-1).setRun(false);
            listaProdN.remove(listaProdN.size()-1);
        }
    }//GEN-LAST:event_RestarNeumaticosActionPerformed

    private void SumarEnsamTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SumarEnsamTMouseClicked
        // TODO add your handling code here:
       
    }//GEN-LAST:event_SumarEnsamTMouseClicked

    private void SumarEnsamTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SumarEnsamTActionPerformed
        // TODO add your handling code here:
         int sum = Integer.parseInt(OperadorEnsamT.getText());
        if(sum<Integer.parseInt(at.getVec()[15])&& sum<3){
        sum++;
        OperadorEnsamT.setText(Integer.toString(sum));
        agregarEnsamT(1);}
    }//GEN-LAST:event_SumarEnsamTActionPerformed

    private void RestarEnsamTMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestarEnsamTMouseClicked
        // TODO add your handling code here:
         
    }//GEN-LAST:event_RestarEnsamTMouseClicked

    private void RestarEnsamTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RestarEnsamTActionPerformed
        // TODO add your handling code here:
     
        if(Integer.parseInt(OperadorEnsamT.getText())>0)
        {
            int res = Integer.parseInt(OperadorEnsamT.getText());
            res--;
            OperadorEnsamT.setText(Integer.toString(res));
        AreaProduccion.append("-Se paro un ensamblador de triciclos "+(listaEnsamT.size()-1)+"-\n");
        listaEnsamT.get(listaEnsamT.size()-1).setRun(false);
        listaEnsamT.remove(listaEnsamT.size()-1);
        if(res==0){
        timeT.stop();
        }
        }
    }//GEN-LAST:event_RestarEnsamTActionPerformed

    private void OperadoresNeumaticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OperadoresNeumaticosActionPerformed
        // TODO add your handling code here:
        if(Integer.parseInt(OperadoresNeumaticos.getText())==1)
            RestarNeumaticos.setEnabled(false);
    }//GEN-LAST:event_OperadoresNeumaticosActionPerformed

    private void BotonDetenerEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_BotonDetenerEKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonDetenerEKeyTyped

    private void BotonDetenerEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonDetenerEActionPerformed
        // TODO add your handling code here:
         int i = listaEnsamT.size()-1;
       int j = listaEnsamB.size()-1; 
                
       
       while(i >= 0){
            listaEnsamT.get(i).setRun(false);
            AreaEnsamblaje.append("****** Ensamblador de Triciclo "+i+" parado ******\n");
            listaEnsamT.remove(i);
            i--;
        }
       
       
       
        while(j >= 0){
            listaEnsamB.get(j).setRun(false);
            AreaEnsamblaje.append("****** Ensamblador de Bicicleta "+j+" parado ******\n");
            listaEnsamB.remove(j);
            j--;
        }
        
        
        timeT.stop();
        timeB.stop();
    }//GEN-LAST:event_BotonDetenerEActionPerformed

    private void trampillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_trampillaActionPerformed
        // TODO add your handling code here:
        if (NumTrici.getText()==at.getVec()[2]){
            System.out.println("funcionaa");
        }
    }//GEN-LAST:event_trampillaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pantalla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pantalla().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(pantalla.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    
    public void IniciarProd(){
        
            for (int i = 0; i < listaProdR.size(); i++){
           
               listaProdR.get(i).setRun(true);
           
           }
               
          for (int i = 0; i < listaProdM.size(); i++){
           
               listaProdM.get(i).setRun(true);
           
           }
          
          for (int i = 0; i < listaProdN.size(); i++){
           
               listaProdN.get(i).setRun(true);
           
           }
          
          for (int i = 0; i < listaProdB.size(); i++){
           
               listaProdB.get(i).setRun(true);
           
           }
          
            System.out.println("Se PARO");
        
        
        }
    
    public void pararProd (){
        
        int i = listaProdR.size()-1;
        while(i >= 0){
        
          //  listaProdR.get(i).stop();
                         listaProdR.get(i).setRun(false);

            AreaProduccion.append("- Productor de Ruedas "+i+"parado - \n");
            listaProdR.remove(i);
            i--;
        }
        
        i = listaProdM.size()-1;
        while(i >= 0){
        
         //   listaProdM.get(i).stop();
                         listaProdM.get(i).setRun(false);

            AreaProduccion.append("- Productor de Marcos"+i+"parado + \n");
            listaProdM.remove(i);
            i--;
        
        }
        
        i = listaProdN.size()-1;
        while(i >= 0){
        
         //   listaProdM.get(i).stop();
                         listaProdN.get(i).setRun(false);

            AreaProduccion.append("- Productor de Neumaticos"+i+"parado + \n");
            listaProdN.remove(i);
            i--;
        
        }
        
        i = listaProdB.size()-1;
        while(i >= 0){
        
         //   listaProdM.get(i).stop();
                         listaProdB.get(i).setRun(false);

            AreaProduccion.append("- Productor de Bujes"+i+"parado + \n");
            listaProdB.remove(i);
            i--;
        
        }
        
        }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextArea AreaEnsamblaje;
    public javax.swing.JTextArea AreaProduccion;
    private javax.swing.JProgressBar BarraB;
    private javax.swing.JProgressBar BarraM;
    private javax.swing.JProgressBar BarraN;
    private javax.swing.JProgressBar BarraR;
    private javax.swing.JButton BotonDetenerE;
    private javax.swing.JButton BotonDetenerP;
    private javax.swing.JButton BotonIniciarE;
    private javax.swing.JButton BotonIniciarP;
    private javax.swing.JLabel NumBici;
    private javax.swing.JLabel NumTrici;
    public javax.swing.JLabel OperadorEnsamB;
    public javax.swing.JLabel OperadorEnsamT;
    private javax.swing.JTextField OperadoresBujes;
    private javax.swing.JTextField OperadoresMarcos;
    private javax.swing.JTextField OperadoresNeumaticos;
    private javax.swing.JTextField OperadoresRuedas;
    private javax.swing.JButton RestarBujes;
    private javax.swing.JButton RestarEnsamB;
    private javax.swing.JButton RestarEnsamT;
    private javax.swing.JButton RestarMarcos;
    private javax.swing.JButton RestarNeumaticos;
    private javax.swing.JButton RestarRuedas;
    private javax.swing.JButton SumarBujes;
    private javax.swing.JButton SumarEnsamB;
    private javax.swing.JButton SumarEnsamT;
    private javax.swing.JButton SumarMarcos;
    private javax.swing.JButton SumarNeumaticos;
    private javax.swing.JButton SumarRuedas;
    private javax.swing.JLabel dia;
    private javax.swing.JLabel dia1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel nPB;
    private javax.swing.JLabel nPM;
    private javax.swing.JLabel nPN;
    private javax.swing.JLabel nPR;
    private javax.swing.JTextField trampilla;
    // End of variables declaration//GEN-END:variables
}
