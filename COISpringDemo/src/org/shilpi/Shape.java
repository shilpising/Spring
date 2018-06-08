package org.shilpi;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public interface Shape extends  InitializingBean, DisposableBean{

	public void show();
}
