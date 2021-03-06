
/*
 * This file is part of Jkop for Android
 * Copyright (c) 2016-2017 Job and Esther Technologies, Inc.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 * 
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package cape;

public class Queue<T>
{
	private java.util.ArrayList<T> data = null;

	public Queue() {
		data = new java.util.ArrayList<T>();
	}

	public void push(T o) {
		cape.Vector.append(data, o);
	}

	public T pop() {
		int sz = cape.Vector.getSize(data);
		if(sz < 1) {
			return((T)(null));
		}
		T v = cape.Vector.getAt(data, 0);
		cape.Vector.remove(data, 0);
		return(v);
	}

	public T peek() {
		int sz = cape.Vector.getSize(data);
		if(sz < 1) {
			return((T)(null));
		}
		return(cape.Vector.getAt(data, 0));
	}

	public boolean isEmpty() {
		return(getSize() < 1);
	}

	public int getSize() {
		return(cape.Vector.getSize(data));
	}

	public java.util.ArrayList<T> getData() {
		return(data);
	}

	public Queue<T> setData(java.util.ArrayList<T> v) {
		data = v;
		return(this);
	}
}
