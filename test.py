import pytest 
import fonctions as f

def test_1() :
	assert f.puissances(2,3) == 8
	assert f.puissances(2,2) == 4

def test_2() : 
	assert (-1)