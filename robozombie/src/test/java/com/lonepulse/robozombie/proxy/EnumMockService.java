package com.lonepulse.robozombie.proxy;

/*
 * #%L
 * RoboZombie
 * %%
 * Copyright (C) 2013 Lonepulse
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

import com.lonepulse.robozombie.annotation.Bite;

/**
 * <p>Emulates an enum which requires endpoint injection.</p>
 * 
 * @version 1.1.0
 * <br><br>
 * @since 1.2.4
 * <br><br>
 * @category test
 * <br><br> 
 * @author <a href="mailto:sahan@lonepulse.com">Lahiru Sahan Jayasinghe</a>
 */
public enum EnumMockService {
	
	
	INSTANCE;
	
	
	@Bite
	private static MockEndpoint staticEndpoint;
	
	@Bite
	private MockEndpoint endpoint;
	
	{
		Zombie.infect(this);
	}
	
	
	public MockEndpoint getEndpoint() {
		
		return endpoint;
	}
	
	public static MockEndpoint getStaticEndpoint() {
		
		return staticEndpoint;
	}
}