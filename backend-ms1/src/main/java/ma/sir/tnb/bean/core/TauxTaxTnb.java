package ma.sir.tnb.bean.core;

import java.util.Objects;






import com.fasterxml.jackson.annotation.JsonInclude;
import ma.sir.tnb.zynerator.audit.AuditBusinessObject;
import javax.persistence.*;
import java.util.Objects;


import java.math.BigDecimal;


@Entity
@Table(name = "taux_tax_tnb")
@JsonInclude(JsonInclude.Include.NON_NULL)
@SequenceGenerator(name="taux_tax_tnb_seq",sequenceName="taux_tax_tnb_seq",allocationSize=1, initialValue = 1)
public class TauxTaxTnb   extends AuditBusinessObject     {

    private Long id;

    private BigDecimal prixMatreCarre = BigDecimal.ZERO;

    private CategorieTerrain categorieTerrain ;
    


    public TauxTaxTnb(){
        super();
    }





    @Id
    @Column(name = "id")
        @GeneratedValue(strategy = GenerationType.SEQUENCE,generator="taux_tax_tnb_seq")
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }
    public BigDecimal getPrixMatreCarre(){
        return this.prixMatreCarre;
    }
    public void setPrixMatreCarre(BigDecimal prixMatreCarre){
        this.prixMatreCarre = prixMatreCarre;
    }
    @ManyToOne(fetch = FetchType.LAZY)
    public CategorieTerrain getCategorieTerrain(){
        return this.categorieTerrain;
    }
    public void setCategorieTerrain(CategorieTerrain categorieTerrain){
        this.categorieTerrain = categorieTerrain;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TauxTaxTnb tauxTaxTnb = (TauxTaxTnb) o;
        return id != null && id.equals(tauxTaxTnb.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

}

