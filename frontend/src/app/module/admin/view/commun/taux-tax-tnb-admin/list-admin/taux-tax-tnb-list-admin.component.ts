import {Component, OnInit} from '@angular/core';
import {TauxTaxTnbService} from 'src/app/controller/service/TauxTaxTnb.service';
import {TauxTaxTnbDto} from 'src/app/controller/model/TauxTaxTnb.model';
import {TauxTaxTnbCriteria} from 'src/app/controller/criteria/TauxTaxTnbCriteria.model';
import {AbstractListController} from 'src/app/zynerator/controller/AbstractListController';
import { environment } from 'src/environments/environment';

import { CategorieTerrainService } from 'src/app/controller/service/CategorieTerrain.service';

import {CategorieTerrainDto} from 'src/app/controller/model/CategorieTerrain.model';


@Component({
  selector: 'app-taux-tax-tnb-list-admin',
  templateUrl: './taux-tax-tnb-list-admin.component.html'
})
export class TauxTaxTnbListAdminComponent extends AbstractListController<TauxTaxTnbDto, TauxTaxTnbCriteria, TauxTaxTnbService>  implements OnInit {

    fileName = 'TauxTaxTnb';

    categorieTerrains :Array<CategorieTerrainDto>;
  
    constructor(tauxTaxTnbService: TauxTaxTnbService, private categorieTerrainService: CategorieTerrainService) {
        super(tauxTaxTnbService);
    }

    ngOnInit() : void {
      this.findPaginatedByCriteria();
      this.initExport();
      this.initCol();
      this.loadCategorieTerrain();
    }

    public async loadTauxTaxTnbs(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TauxTaxTnb', 'list');
        isPermistted ? this.service.findAll().subscribe(tauxTaxTnbs => this.items = tauxTaxTnbs,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'erreur', detail: 'problème d\'autorisation'});
    }


    public initCol() {
        this.cols = [
            {field: 'prixMatreCarre', header: 'Prix matre carre'},
            {field: 'categorieTerrain?.libelle', header: 'Categorie terrain'},
        ];
    }


    public async loadCategorieTerrain(){
        await this.roleService.findAll();
        const isPermistted = await this.roleService.isPermitted('TauxTaxTnb', 'list');
        isPermistted ? this.categorieTerrainService.findAllOptimized().subscribe(categorieTerrains => this.categorieTerrains = categorieTerrains,error=>console.log(error))
        : this.messageService.add({severity: 'error', summary: 'Erreur', detail: 'Problème de permission'});
    }

	public initDuplicate(res: TauxTaxTnbDto) {
	}

   public prepareColumnExport() : void {
        this.exportData = this.items.map(e => {
            return {
                 'Prix matre carre': e.prixMatreCarre ,
                'Categorie terrain': e.categorieTerrain?.libelle ,
            }
        });

        this.criteriaData = [{
            'Prix matre carre Min': this.criteria.prixMatreCarreMin ? this.criteria.prixMatreCarreMin : environment.emptyForExport ,
            'Prix matre carre Max': this.criteria.prixMatreCarreMax ? this.criteria.prixMatreCarreMax : environment.emptyForExport ,
        //'Categorie terrain': this.criteria.categorieTerrain?.libelle ? this.criteria.categorieTerrain?.libelle : environment.emptyForExport ,
        }];
      }
}
