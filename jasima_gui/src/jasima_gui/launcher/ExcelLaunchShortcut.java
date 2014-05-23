/*******************************************************************************
 * Copyright (c) 2010, 2014 Torsten Hildebrandt and jasima contributors
 *
 * This file is part of jasima, v1.1.
 *
 * jasima is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * jasima is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with jasima.  If not, see <http://www.gnu.org/licenses/>.
 *
 * $Id$
 *******************************************************************************/
package jasima_gui.launcher;

import jasima_gui.pref.Pref;

import org.eclipse.debug.core.ILaunchConfigurationType;

public class ExcelLaunchShortcut extends SimulationLaunchShortcut {

	@Override
	protected String getDefaultArgs() {
		return Pref.XLS_EXP_RES_FMT.val();
	}

	@Override
	protected String getLauncherClass() {
		return "jasima.core.util.run.ExcelExperimentRunner";
	}

	protected ILaunchConfigurationType getConfigurationType() {
		return getLaunchManager().getLaunchConfigurationType(
				"jasima_gui.jasimaLaunchConfigurationType");
	}
}
