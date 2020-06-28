"""import wordcloud
  # 使用wordcloud库下的WordCloud类并设置参数
                        # 设置背景颜色为白色
a = wordcloud.WordCloud(background_color = 'white',\
                             # 设置字体为'msyh.ttc'，也就是微软雅黑字体
                             font_path = 'msyh.ttc',\
                             # 设置宽度为2000像素
                             width = 2000,\
                             # 设置高度为1500像素
                             height = 1500,\
                             # 设置最大词数为50词； # generate，根据字符串生成词云
                             max_words = 50).generate('My house is perfect. \
                             By great good fortune I have found a housekeeper \
                             light-footed woman of discreet age, strong and deft enough \
                             to render me all the service I require, and not \
                             She rises very early. By my breakfast-time there \
                             remains little to be done under the roof save dress\
                             Very rarely do I hear even a clink of crockery; never\
                             Oh, blessed silence! My house is perfect. \
                             Just large enough to allow the grace of order in domestic')
# 将生成的词云存为英文状态下的词云的文件
a.to_file('英文状态下的词云.jpg')"""
import wordcloud
txt = "life is short , you need python"
w = wordcloud.WordCloud(\
    background_color="white")
w.generate(txt)
w.to_file("pwdcloud.png")
"""import requests        #导入requests包
url = 'http://www.cntour.cn/'
strhtml = requests.get(url)        #Get方式获取网页数据
print(strhtml.text)"""
"""import requests        #导入requests包
import json
def get_translate_date(word=None):
    url = 'http://fanyi.youdao.com/translate?smartresult=dict&smartresult=rule'
    From_data={'i':word,'from':'zh-CHS','to':'en','smartresult':'dict','client':'fanyideskweb','salt':'15477056211258','sign':'b3589f32c38bc9e3876a570b8a992604','ts':'1547705621125','bv':'b33a2f3f9d09bde064c9275bcb33d94e','doctype':'json','version':'2.1','keyfrom':'fanyi.web','action':'FY_BY_REALTIME','typoResult':'false'}
    #请求表单数据
    response = requests.post(url,data=From_data)
    #将Json格式字符串转字典
    content = json.loads(response.text)
    print(content)
    #打印翻译后的数据
    #print(content['translateResult'][0][0]['tgt'])
if __name__=='__main__':
    get_translate_date('我爱中国')"""

import requests        #导入requests包
from bs4 import    BeautifulSoup
url='http://www.cntour.cn/'
strhtml=requests.get(url)
soup=BeautifulSoup(strhtml.text,'lxml')
data = soup.select('#main>div>div.mtop.firstMod.clearfix>div.centerBox>ul.newsList>li>a')
print(data)
for item in data:
    result={
        'title':item.get_text(),
        'link':item.get('href')
    }
print(result)
简单的词云:from turtle import *

color('red', 'yellow')
begin_fill()

while True:

    forward(200)
    left(170)
    if abs(pos()) < 1:
        break

end_fill()

done()
