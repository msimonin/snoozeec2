/**
 * Copyright (C) 2010-2013 Eugen Feller, INRIA <eugen.feller@inria.fr>
 *
 * This file is part of Snooze, a scalable, autonomic, and
 * energy-aware virtual machine (VM) management framework.
 *
 * This program is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, see <http://www.gnu.org/licenses>.
 */
package org.inria.myriads.snoozeec2.exception;

/**
 * Node configuration exception.
 * 
 * @author Eugen Feller
 */
@SuppressWarnings("serial")
public class EC2ConfiguratorException extends Exception 
{
    /** Empty constructor. */
    public EC2ConfiguratorException() 
    {
    }
    
    /**
     * Node configuration exception. 
     * 
     * @param message   The message
     */
    public EC2ConfiguratorException(String message) 
    {
        super(message);
    }
}

