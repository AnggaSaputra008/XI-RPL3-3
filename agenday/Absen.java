/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenday;

/**
 *
 * @author LENOVO
 */
public class Absen {
    private int Sakit;
    private int Izin;
    private int Alfa;

    public void setAlfa(int Alfa) {
        this.Alfa = Alfa;
    }

    public int getAlfa() {
        return Alfa;
    }

    public void setIzin(int Izin) {
        this.Izin = Izin;
    }

    public int getIzin() {
        return Izin;
    }

    public void setSakit(int Sakit) {
        this.Sakit = Sakit;
    }

    public int getSakit() {
        return Sakit;
    }
    
    public void Kehadiran(Boolean Hadir,  String Keterangan){};
}
