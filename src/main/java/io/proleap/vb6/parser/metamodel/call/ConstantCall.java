/*
 * Copyright (C) 2016, Ulrich Wolffgang <u.wol@wwu.de>
 * All rights reserved.
 *
 * This software may be modified and distributed under the terms
 * of the BSD 3-clause license. See the LICENSE file for details.
 */

package io.proleap.vb6.parser.metamodel.call;

import io.proleap.vb6.parser.metamodel.statement.constant.Constant;

public interface ConstantCall extends Call {

	Constant getConstant();

}
