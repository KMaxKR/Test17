package entity;

import Exceptions.*;

public class ShopList {
    private String FullName;
    private String Cpu;
    private String Gpu;
    private double Diagonal;
    private int Ram;

    public void setFullName(String fullName) {
        if(!fullName.equals("")){
            this.FullName = fullName;
        }else {
            throw new FullNameException("fullName can not by empty");
        }

    }

    public void setCpu(String Cpu) {
        if(!Cpu.equals("")){
            this.Cpu = Cpu;
        }else {
            throw new CpuException("Cpu can not by empty");
        }
    }

    public void setGpu(String Gpu) {
        if(!Gpu.equals("")){
            this.Gpu = Gpu;
        }else {
            throw new GpuException("Gpu can not by empty");
        }
    }

    public void setDiagonal(double Diagonal) {
        if(Diagonal >= 5 && Diagonal <= 30){
            this.Diagonal = Diagonal;
        }else{
            throw new DiagonalException("DiagonalException... Admissible range from 5 to 30 Inch");
        }
    }

    public void setRam(int Ram) {
        if(Ram >= 1 && Ram <= 64){
            this.Ram = Ram;
        }else {
            throw new RamException("RamLimitException... Admissible range from 1 to 64 GB");
        }

    }

    public ShopList(String fullName, String Cpu, String Gpu, double Diagonal, int Ram){
        setFullName(fullName);
        setCpu(Cpu);
        setGpu(Gpu);
        setDiagonal(Diagonal);
        setRam(Ram);
    }
    public String getProductSpecs(){
        return FullName + " " + Cpu + " " + Gpu + " " + Diagonal + " " + Ram;
    }

}
