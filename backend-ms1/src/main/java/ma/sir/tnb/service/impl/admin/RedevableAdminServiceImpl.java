package ma.sir.tnb.service.impl.admin;

import ma.sir.tnb.bean.core.Redevable;
import ma.sir.tnb.bean.history.RedevableHistory;
import ma.sir.tnb.dao.criteria.core.RedevableCriteria;
import ma.sir.tnb.dao.criteria.history.RedevableHistoryCriteria;
import ma.sir.tnb.dao.facade.core.RedevableDao;
import ma.sir.tnb.dao.facade.history.RedevableHistoryDao;
import ma.sir.tnb.dao.specification.core.RedevableSpecification;
import ma.sir.tnb.service.facade.admin.RedevableAdminService;
import ma.sir.tnb.zynerator.service.AbstractServiceImpl;
import ma.sir.tnb.zynerator.util.ListUtil;
import org.springframework.stereotype.Service;
import java.util.List;






import java.util.List;
@Service
public class RedevableAdminServiceImpl extends AbstractServiceImpl<Redevable,RedevableHistory, RedevableCriteria, RedevableHistoryCriteria, RedevableDao,
RedevableHistoryDao> implements RedevableAdminService {








    public void configure() {
        super.configure(Redevable.class,RedevableHistory.class, RedevableHistoryCriteria.class, RedevableSpecification.class);
    }


    public RedevableAdminServiceImpl(RedevableDao dao, RedevableHistoryDao historyDao) {
        super(dao, historyDao);
    }

}