/*******************************************************************************
 * Copyright (c) 2010-2015 Torsten Hildebrandt and jasima contributors
 *
 * This file is part of jasima, v1.2.
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
 *******************************************************************************/
package jasima_gui.util;

import java.util.Comparator;

public class ToStringBasedComparator implements Comparator<Object> {
	public static final ToStringBasedComparator INSTANCE = new ToStringBasedComparator();

	protected ToStringBasedComparator() {
	}

	@Override
	public int compare(Object o1, Object o2) {
		return String.valueOf(o1).compareTo(String.valueOf(o2));
	}

}
