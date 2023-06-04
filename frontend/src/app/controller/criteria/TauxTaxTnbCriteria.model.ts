import {CategorieTerrainCriteria} from './CategorieTerrainCriteria.model';
import {BaseCriteria} from 'src/app/zynerator/criteria/BaseCriteria.model';


export class TauxTaxTnbCriteria  extends   BaseCriteria  {

    public id: number;
     public prixMatreCarre: number;
     public prixMatreCarreMin: number;
     public prixMatreCarreMax: number;
  public categorieTerrain: CategorieTerrainCriteria ;
  public categorieTerrains: Array<CategorieTerrainCriteria> ;

}
