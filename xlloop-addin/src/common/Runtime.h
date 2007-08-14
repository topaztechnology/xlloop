/*******************************************************************************
 * This program and the accompanying materials
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     Peter Smith
 *******************************************************************************/

#ifndef RUNTIME_H
#define RUNTIME_H

#define WIN32_LEAN_MEAN
#include <windows.h>

#ifdef NDEBUG
#pragma comment(linker, "/FILEALIGN:0x200")
#pragma comment(linker, "/ALIGN:0x200")
#endif

#endif 