package  ma.sir.tnb.ws.dto;

import ma.sir.tnb.zynerator.audit.Log;
import ma.sir.tnb.zynerator.dto.AuditBaseDto;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.math.BigDecimal;


@JsonInclude(JsonInclude.Include.NON_NULL)
public class TauxTaxTnbDto  extends AuditBaseDto {

    private BigDecimal prixMatreCarre  ;

    private CategorieTerrainDto categorieTerrain ;



    public TauxTaxTnbDto(){
        super();
    }



    @Log
    public BigDecimal getPrixMatreCarre(){
        return this.prixMatreCarre;
    }
    public void setPrixMatreCarre(BigDecimal prixMatreCarre){
        this.prixMatreCarre = prixMatreCarre;
    }


    public CategorieTerrainDto getCategorieTerrain(){
        return this.categorieTerrain;
    }

    public void setCategorieTerrain(CategorieTerrainDto categorieTerrain){
        this.categorieTerrain = categorieTerrain;
    }




}
