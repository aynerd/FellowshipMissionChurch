package church.android.fellowshipmission.db;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig audioMessageDaoConfig;

    private final AudioMessageDao audioMessageDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        audioMessageDaoConfig = daoConfigMap.get(AudioMessageDao.class).clone();
        audioMessageDaoConfig.initIdentityScope(type);

        audioMessageDao = new AudioMessageDao(audioMessageDaoConfig, this);

        registerDao(AudioMessage.class, audioMessageDao);
    }
    
    public void clear() {
        audioMessageDaoConfig.clearIdentityScope();
    }

    public AudioMessageDao getAudioMessageDao() {
        return audioMessageDao;
    }

}