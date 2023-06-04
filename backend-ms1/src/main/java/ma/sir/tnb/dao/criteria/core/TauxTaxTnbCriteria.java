package  ma.sir.tnb.dao.criteria.core;


import ma.sir.tnb.zynerator.criteria.BaseCriteria;
import java.util.List;

public class TauxTaxTnbCriteria extends  BaseCriteria  {

    private String prixMatreCarre;
    private String prixMatreCarreMin;
    private String prixMatreCarreMax;

    private CategorieTerrainCriteria categorieTerrain ;
    private List<CategorieTerrainCriteria> categorieTerrains ;


    public TauxTaxTnbCriteria(){}

    public String getPrixMatreCarre(){
        return this.prixMatreCarre;
    }
    public void setPrixMatreCarre(String prixMatreCarre){
        this.prixMatreCarre = prixMatreCarre;
    }   
    public String getPrixMatreCarreMin(){
        return this.prixMatreCarreMin;
    }
    public void setPrixMatreCarreMin(String prixMatreCarreMin){
        this.prixMatreCarreMin = prixMatreCarreMin;
    }
    public String getPrixMatreCarreMax(){
        return this.prixMatreCarreMax;
    }
    public void setPrixMatreCarreMax(String prixMatreCarreMax){
        this.prixMatreCarreMax = prixMatreCarreMax;
    }
      

    public CategorieTerrainCriteria getCategorieTerrain(){
        return this.categorieTerrain;
    }

    public void setCategorieTerrain(CategorieTerrainCriteria categorieTerrain){
        this.categorieTerrain = categorieTerrain;
    }
    public List<CategorieTerrainCriteria> getCategorieTerrains(){
        return this.categorieTerrains;
    }

    public void setCategorieTerrains(List<CategorieTerrainCriteria> categorieTerrains){
        this.categorieTerrains = categorieTerrains;
    }
}
