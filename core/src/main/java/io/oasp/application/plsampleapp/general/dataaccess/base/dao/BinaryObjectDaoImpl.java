package io.oasp.application.plsampleapp.general.dataaccess.base.dao;

import io.oasp.application.plsampleapp.general.dataaccess.api.BinaryObjectEntity;
import io.oasp.application.plsampleapp.general.dataaccess.api.dao.BinaryObjectDao;

import javax.inject.Named;

/**
 * Implementation of {@link BinaryObjectDao}.
 *
 */
@Named
public class BinaryObjectDaoImpl extends ApplicationDaoImpl<BinaryObjectEntity> implements BinaryObjectDao {

  @Override
  public Class<BinaryObjectEntity> getEntityClass() {

    return BinaryObjectEntity.class;
  }

}
