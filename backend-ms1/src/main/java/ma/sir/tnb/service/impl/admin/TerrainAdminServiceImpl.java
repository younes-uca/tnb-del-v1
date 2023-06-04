package ma.sir.tnb.service.impl.admin;

import ma.sir.tnb.bean.core.Terrain;
import ma.sir.tnb.bean.history.TerrainHistory;
import ma.sir.tnb.dao.criteria.core.TerrainCriteria;
import ma.sir.tnb.dao.criteria.history.TerrainHistoryCriteria;
import ma.sir.tnb.dao.facade.core.TerrainDao;
import ma.sir.tnb.dao.facade.history.TerrainHistoryDao;
import ma.sir.tnb.dao.specification.core.TerrainSpecification;
import ma.sir.tnb.service.facade.admin.TerrainAdminService;
import ma.sir.tnb.zynerator.service.AbstractServiceImpl;
import ma.sir.tnb.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;


import ma.sir.tnb.service.facade.admin.CategorieTerrainAdminService ;
import ma.sir.tnb.service.facade.admin.RedevableAdminService ;


import java.util.List;
@Service
public class TerrainAdminServiceImpl extends AbstractServiceImpl<Terrain,TerrainHistory, TerrainCriteria, TerrainHistoryCriteria, TerrainDao,
TerrainHistoryDao> implements TerrainAdminService {



    public Terrain findByReferenceEntity(Terrain t){
        return  dao.findByRef(t.getRef());
    }

    public List<Terrain> findByCategorieTerrainId(Long id){
        return dao.findByCategorieTerrainId(id);
    }
    public int deleteByCategorieTerrainId(Long id){
        return dao.deleteByCategorieTerrainId(id);
    }
    public List<Terrain> findByRedevableId(Long id){
        return dao.findByRedevableId(id);
    }
    public int deleteByRedevableId(Long id){
        return dao.deleteByRedevableId(id);
    }




    public void configure() {
        super.configure(Terrain.class,TerrainHistory.class, TerrainHistoryCriteria.class, TerrainSpecification.class);
    }

    @Autowired
    private CategorieTerrainAdminService categorieTerrainService ;
    @Autowired
    private RedevableAdminService redevableService ;

    public TerrainAdminServiceImpl(TerrainDao dao, TerrainHistoryDao historyDao) {
        super(dao, historyDao);
    }

}