from lxml import html #$ pip install lxml
import requests #$ python setup.py install

from blog.models import Post
from django.contrib.auth.models import User
me = User.objects.get(username='admin')
from django.utils import timezone

def script(number_of_sonnets, first_sonnet):
    for i in range(num_of_sonn):
	    URL = 'http://www.shakespeares-sonnets.com/sonnet/'
        page = requests.get(URL + str(i+first_sonnet))
        tree = html.fromstring(page.content)
        sonnet = tree.xpath('//p[@id="sonnettext"]/em/text()')
        if len(sonnet) != 0:
			sonnet_text = ""
			sonnet_name = 'Sonnet ' + str(i+first_sonnet)
	        #print('\nSonnet ' + str(i+first_sonnet) + '\n')
	        for q in sonnet:
				sonnet_text += q + ' \n'
		        #print(q)
			#print(sonnet_name)
			#print(sonnet_text)
			
			#создаем объект Post в базе данных:
			Post.objects.create(author=me, title=sonnet_name, text=sonnet_text)
			#публикуем post с очередным соннетом:
			Post.objects.get(title=sonnet_name).publish()

			
script(200,1)
Post.objects.filter(published_date__lte=timezone.now())
input()

#Post.object.all().delete() - удалить все

#f = open('text.txt', 'r') #открыть файл для чтения
#f.read(1) #считает 1 символ (дальше будет считывать последующие, () считает все)
#for line in f:
#   line
#f = open('text.txt', 'w') #открыть файл для записи
#for index in l:
#    f.write(index + '\n')
