#!/usr/bin/python3
# -*- coding: utf-8 -*-
# Author: Volkan Şahin <volkansah.in> <bm.volkansahin@gmail.com>

from base.plugin.abstract_plugin import AbstractPlugin


class Safe(AbstractPlugin):
    def __init__(self, context):
        super(Safe, self).__init__()
        self.context = context
        self.name = str(context.get_username())
        self.logger = self.get_logger()

    def handle_safe_mode(self):
        # TODO Do what do you want to do!
        pass


def handle_mode(context):
    sample = Safe(context)
    sample.handle_safe_mode()
