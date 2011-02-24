/*
 * JBoss, Home of Professional Open Source
 * Copyright 2010, Red Hat, Inc. and/or its affiliates, and individual
 * contributors as indicated by the @authors tag. All rights reserved.
 * See the copyright.txt in the distribution for a full listing
 * of individual contributors.
 * 
 * This copyrighted material is made available to anyone wishing to use,
 * modify, copy, or redistribute it subject to the terms and conditions
 * of the GNU General Public License, v. 2.0.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of 
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU 
 * General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License,
 * v. 2.0 along with this distribution; if not, write to the Free 
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 */
package org.jdiameter.client.impl.app.gx;

import java.io.Serializable;

import org.jdiameter.api.Request;
import org.jdiameter.common.api.app.gx.ClientGxSessionState;
import org.jdiameter.common.api.app.gx.IGxSessionData;

/**
 * 
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 * @author <a href="mailto:brainslog@gmail.com"> Alexandre Mendonca </a>
 */
public interface IClientGxSessionData extends IGxSessionData {

  public boolean isEventBased();

  public void setEventBased(boolean b);

  public boolean isRequestTypeSet();

  public void setRequestTypeSet(boolean b);

  public ClientGxSessionState getClientGxSessionState();

  public void setClientGxSessionState(ClientGxSessionState state);

  public Serializable getTxTimerId();

  public void setTxTimerId(Serializable txTimerId);

  public Request getTxTimerRequest();

  public void setTxTimerRequest(Request txTimerRequest);

  public Request getBuffer();

  public void setBuffer(Request buffer);

  public int getGatheredRequestedAction();

  public void setGatheredRequestedAction(int gatheredRequestedAction);

  public int getGatheredCCFH();

  public void setGatheredCCFH(int gatheredCCFH);

  public int getGatheredDDFH();

  public void setGatheredDDFH(int gatheredDDFH);
}