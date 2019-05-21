/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.spin.spintest.base;

import java.util.Date;

/**
 *
 * @author lucas
 */
public abstract class SAbstractEntity<T> {

    public abstract T getId();

    public abstract String getUserId();

    public abstract void setUserId(String userId);

    public abstract String getUpdatedUserId();

    public abstract void setUpdatedUserId(String updatedUserId);

    public abstract Date getCreatedAt();

    public abstract void setCreatedAt(Date createdAt);

    public abstract Date getUpdatedAt();

    public abstract void setUpdatedAt(Date uspdatedAt);

}
