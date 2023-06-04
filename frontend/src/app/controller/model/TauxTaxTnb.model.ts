import {CategorieTerrainDto} from './CategorieTerrain.model';
import {BaseDto} from 'src/app/zynerator/dto/BaseDto.model';


export class TauxTaxTnbDto  extends BaseDto{

    public id: number;
    public prixMatreCarre: number;
    public prixMatreCarreMax: string ;
    public prixMatreCarreMin: string ;
    public categorieTerrain: CategorieTerrainDto ;

}
