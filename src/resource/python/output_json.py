import json
from collections import OrderedDict


data = dict()

data["2012"] = [{'name': 'キティ', 'numberOfVotes': 19368500}, {'name': 'ポムポムプリン', 'numberOfVotes': 10173500}, {
    'name': 'ポチャッコ', 'numberOfVotes': 3190800}, {'name': 'シナモロール', 'numberOfVotes': 10232400}, {'name': 'マイメロディー', 'numberOfVotes': 17805400}]
data["2013"] = [{'name': 'キティ', 'numberOfVotes': 18869700}, {'name': 'ポムポムプリン', 'numberOfVotes': 13273900}, {
    'name': 'ポチャッコ', 'numberOfVotes': 3513100}, {'name': 'シナモロール', 'numberOfVotes': 7952000}, {'name': 'マイメロディー', 'numberOfVotes': 17983500}]
data["2014"] = [{'name': 'キティ', 'numberOfVotes': 7295100}, {'name': 'ポムポムプリン', 'numberOfVotes': 4728300}, {
    'name': 'ポチャッコ', 'numberOfVotes': 1754200}, {'name': 'シナモロール', 'numberOfVotes': 4451500}, {'name': 'マイメロディー', 'numberOfVotes': 7923500}]
data["2015"] = [{'name': 'キティ', 'numberOfVotes': 14334200}, {'name': 'ポムポムプリン', 'numberOfVotes': 27083700}, {
    'name': 'シナモロール', 'numberOfVotes': 26227400}, {'name': 'マイメロディー', 'numberOfVotes': 20388300}]
data["2016"] = [{'name': 'キティ', 'numberOfVotes': 51911300}, {'name': 'ポムポムプリン', 'numberOfVotes': 80738900}, {
    'name': 'シナモロール', 'numberOfVotes': 70320700}, {'name': 'マイメロディー', 'numberOfVotes': 63266200}]
data["2017"] = [{'name': 'キティ', 'numberOfVotes': 27357600}, {'name': 'ポムポムプリン', 'numberOfVotes': 47324900}, {'name': 'ポチャッコ',
                                                                                                             'numberOfVotes': 12797100}, {'name': 'シナモロール', 'numberOfVotes': 65615400}, {'name': 'マイメロディー', 'numberOfVotes': 33884900}]
data["2018"] = [{'name': 'キティ', 'numberOfVotes': 32724500}, {'name': 'ポムポムプリン', 'numberOfVotes': 50018800}, {'name': 'ポチャッコ',
                                                                                                             'numberOfVotes': 26139500}, {'name': 'シナモロール', 'numberOfVotes': 52022400}, {'name': 'マイメロディー', 'numberOfVotes': 29733500}]
data["2019"] = [{'name': 'キティ', 'numberOfVotes': 164707300}, {'name': 'ポムポムプリン', 'numberOfVotes': 122178800}, {'name': 'ポチャッコ',
                                                                                                               'numberOfVotes': 96676300}, {'name': 'シナモロール', 'numberOfVotes': 158405700}, {'name': 'マイメロディー', 'numberOfVotes': 102238100}]
data["2020"] = [{'name': 'キティ', 'numberOfVotes': 83990400}, {'name': 'ポムポムプリン', 'numberOfVotes': 128824500}, {'name': 'ポチャッコ',
                                                                                                              'numberOfVotes': 101392700}, {'name': 'シナモロール', 'numberOfVotes': 138715200}, {'name': 'マイメロディー', 'numberOfVotes': 88348500}]
data["2021"] = [{'name': 'キティ', 'numberOfVotes': 1144265000}, {'name': 'ポムポムプリン', 'numberOfVotes': 2166543000}, {'name': 'ポチャッコ',
                                                                                                                 'numberOfVotes': 1468247000}, {'name': 'シナモロール', 'numberOfVotes': 2134222000}, {'name': 'マイメロディー', 'numberOfVotes': 1422881000}]


with open('sanrio.json', mode='wt', encoding='utf-8') as file:
    json.dump(data, file, ensure_ascii=False, indent=2)
