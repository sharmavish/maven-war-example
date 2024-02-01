/*
 * Copyright 2016-2016 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.joinfaces.example.view;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HiCCPage extends AbstractPageComponent {

	public HiCCPage(WebDriver webDriver) {
		super(webDriver);
	}

	@Override
	public String getLocation() {
		return "hiCC.faces";
	}

	private By getHiCCDivBy() {
		return By.id("hiCC:outputTextComponentId");
	}

	public String getHiCCText() {
		return webDriver.findElement(getHiCCDivBy()).getText();
	}

	public HiCCPage waitLoad() {
		new WebDriverWait(webDriver, Duration.ofSeconds(10))
			.until(ExpectedConditions.presenceOfElementLocated(getHiCCDivBy()));

		return this;
	}

}
